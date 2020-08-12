package br.com.detroit.store.dtos;

import java.util.List;

public class PurchaseDTO {
	
	private List<OrderItemsDTO> orderItems;
	
	public List<OrderItemsDTO> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItemsDTO> orderItems) {
		this.orderItems = orderItems;
	}
}
