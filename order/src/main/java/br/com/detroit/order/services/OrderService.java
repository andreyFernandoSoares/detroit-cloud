package br.com.detroit.order.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.detroit.order.dtos.OrderItemsDTO;
import br.com.detroit.order.models.OrderItems;
import br.com.detroit.order.models.Orders;
import br.com.detroit.order.models.Product;
import br.com.detroit.order.repositories.OrderRepository;
import br.com.detroit.order.repositories.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;

	public Orders placeOrder(List<OrderItemsDTO> items) {
		
		if (items == null) return null;
		
		List<OrderItems> orderItems = toOrderItem(items);
		Orders order = new Orders(orderItems);
		return orderRepository.save(order);
	}

	public Orders getOrderById(Long id) {
		return this.orderRepository.findById(id).orElse(new Orders());
	}
	
	public List<OrderItems> toOrderItem(List<OrderItemsDTO> items){
		
		List<Long> idsProduct = items.stream().map(i -> i.getId()).collect(Collectors.toList());
		
		List<Product> productInOrder = productRepository.findAllById(idsProduct);
		
		List<OrderItems> pedidoItens = items.stream().map(i -> {
			Product product = productInOrder.stream().filter(p -> p.getId() == i.getId()).findFirst().get();
			
			OrderItems pedidoItem = new OrderItems();
			pedidoItem.setProduct(product);
			pedidoItem.setQuantity(i.getQuantity());
			return pedidoItem;
		}).collect(Collectors.toList());
		
		return pedidoItens;
	}
}
