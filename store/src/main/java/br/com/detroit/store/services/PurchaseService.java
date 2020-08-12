package br.com.detroit.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.detroit.store.clients.OrderClient;
import br.com.detroit.store.dtos.OrderDTO;
import br.com.detroit.store.dtos.PurchaseDTO;
import br.com.detroit.store.models.Purchase;

@Service
public class PurchaseService {
	
	@Autowired
	private OrderClient orderClient;
	
	public Purchase purchase(PurchaseDTO purchase) {
		
		OrderDTO order = orderClient.placeOrder(purchase.getOrderItems());
		
		Purchase savedPurchase = new Purchase();
		savedPurchase.setOrderId(order.getId());
		savedPurchase.setState(order.getState());
		
		return savedPurchase;
	}

}
