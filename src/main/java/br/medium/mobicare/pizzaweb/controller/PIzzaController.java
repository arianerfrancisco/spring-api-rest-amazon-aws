package br.medium.mobicare.pizzaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.medium.mobicare.pizzaweb.dto.PizzaDTO;
import br.medium.mobicare.pizzaweb.service.PizzaService;

@RestController("/pizzas")
public class PIzzaController {
	
	@Autowired
	PizzaService pizzaService;

	@GetMapping("/{id}")
	public ResponseEntity<PizzaDTO> getPizza(@PathVariable("id") int id) {
		PizzaDTO pizza = pizzaService.get(id);
		return new ResponseEntity<PizzaDTO>(pizza, HttpStatus.OK);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<PizzaDTO>> getPizzas() {
		List<PizzaDTO> pizza = pizzaService.getAll();
		return new ResponseEntity<List<PizzaDTO>>(pizza, HttpStatus.OK);
		
	}
}
