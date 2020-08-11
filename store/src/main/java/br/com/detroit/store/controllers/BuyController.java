package br.com.detroit.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.detroit.store.dtos.BuyDTO;
import br.com.detroit.store.models.Buy;
import br.com.detroit.store.services.BuyService;

@RestController
@RequestMapping("/buy")
public class BuyController {
	
	@Autowired
	private BuyService buyService;
	
	@PostMapping
	public Buy purchase(@RequestBody BuyDTO buy) {
		return buyService.purchase(buy);
	}
	
}
