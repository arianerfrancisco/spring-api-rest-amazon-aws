package br.medium.mobicare.pizzaweb.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import br.medium.mobicare.pizzaweb.entity.PizzaEntity;

@Repository
public class PizzaRepository {
	
	public PizzaEntity get(Integer id) {
		FakeDatabase database = new FakeDatabase();
		PizzaEntity pizza = database.getPizza(id);
		return pizza;
	}

	public List<PizzaEntity> getAll() {
		FakeDatabase database = new FakeDatabase();
		return database.getPizzas();
	}
}
