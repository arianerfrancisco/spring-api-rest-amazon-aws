package br.medium.mobicare.pizzaweb.repository;

import java.util.ArrayList;
import java.util.List;

import br.medium.mobicare.pizzaweb.entity.PizzaEntity;

public class FakeDatabase {

	private static List<PizzaEntity> Pizzas = new ArrayList<>();

	static {
		Pizzas.add(new PizzaEntity(1,"Pizza de Calabresa", 10.00, "Mussarela, parmesao, provolone, requeijão, tomate, orégano."));
		Pizzas.add(new PizzaEntity(2,"Pizza de Milho", 10, "Molho de tomate,muçarela,milho e orégano."));
		Pizzas.add(new PizzaEntity(3,"PizzaEntity de Bacon", 10, "Molho de tomate, muçarela,bacon moído ,cebola e orégano."));
		Pizzas.add(new PizzaEntity(4,"Pizza de Presunto", 10, "Molho de Tomate, Muçarela, Presunto e Orégano."));
		Pizzas.add(new PizzaEntity(5,"Pizza de Marguerita", 10, "Molho de Tomate, Muçarela, Manjericão, Tomate e Orégano."));
		Pizzas.add(new PizzaEntity(6,"Pizza de Lombo Canadense", 10,"Molho de Tomate, Muçarela, Cebola, Lombo Canadense e Orégano."));
		Pizzas.add(new PizzaEntity(7,"Pizza de Quatro queijos", 15.00,"Molho de Tomate, Muçarela, Gorgonzola, Provolone, Catupiry e Orégano."));
		Pizzas.add(new PizzaEntity(8,"Pizza de Frango com catupiry", 15.00,"Molho de Tomate, Muçarela, Frango, Catupiry e Orégano."));
		Pizzas.add(new PizzaEntity(9,"Pizza de Frango com Cheddar", 15, "Molho de Tomate, Muçarela, Frango, Cheddar e Orégano."));
		Pizzas.add(new PizzaEntity(10,"Pizza de Catuperoni", 20, "Molho de Tomate, Muçarela, Pepperoni e Catupiry."));
		Pizzas.add(new PizzaEntity(11,"Pizza de Camarão", 20, "Molho de Tomate, Muçarela, Camarão, Cebola e Tomate."));
		Pizzas.add(new PizzaEntity(12,"Pizza de Carne Seca c/ Catupiry", 20,"Molho de Tomate, Muçarela, Carne Seca, Cebola e Catupiry."));
	}

	public List<PizzaEntity> getPizzas() {
		return FakeDatabase.Pizzas;
	}

	public PizzaEntity getPizza(Integer pizzaId) {
		return FakeDatabase.Pizzas.stream().filter(pizza -> pizza.getId().equals(pizzaId)).findAny().orElse(null);
	}
}
