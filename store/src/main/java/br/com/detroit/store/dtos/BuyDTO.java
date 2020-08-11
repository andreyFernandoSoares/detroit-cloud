package br.com.detroit.store.dtos;

import java.util.List;

public class BuyDTO {
	
	private UserDTO user;
	private List<OrderItemsDTO> orderItems;
	
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public List<OrderItemsDTO> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItemsDTO> orderItems) {
		this.orderItems = orderItems;
	}
}
