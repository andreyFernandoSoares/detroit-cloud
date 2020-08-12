package br.com.detroit.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.detroit.store.dtos.PurchaseDTO;
import br.com.detroit.store.models.Purchase;
import br.com.detroit.store.services.PurchaseService;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
	
	@Autowired
	private PurchaseService purchaseService;
	
	@PostMapping
	public Purchase purchase(@RequestBody PurchaseDTO purchase) {
		return purchaseService.purchase(purchase);
	}
	
}
