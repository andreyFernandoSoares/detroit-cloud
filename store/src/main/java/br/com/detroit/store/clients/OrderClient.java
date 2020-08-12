package br.com.detroit.store.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.detroit.store.dtos.OrderDTO;
import br.com.detroit.store.dtos.OrderItemsDTO;

@FeignClient("order")
public interface OrderClient {
	
	@PostMapping("/order")
	OrderDTO placeOrder(List<OrderItemsDTO> items);
	
}
