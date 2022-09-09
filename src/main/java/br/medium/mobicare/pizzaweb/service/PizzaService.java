package br.medium.mobicare.pizzaweb.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.medium.mobicare.pizzaweb.dto.PizzaDTO;
import br.medium.mobicare.pizzaweb.entity.PizzaEntity;
import br.medium.mobicare.pizzaweb.repository.PizzaRepository;

@Service
public class PizzaService {
	
	@Autowired
	PizzaRepository pizzaRepository;

	public PizzaDTO get(Integer id) {		
		PizzaEntity pizzaEntity = pizzaRepository.get(id);
		PizzaDTO PizzaDTO = mapToModel(pizzaEntity);
		
		return PizzaDTO;		
	}

	public List<PizzaDTO> getAll() {
		List<PizzaEntity> pizzasEntity = pizzaRepository.getAll();
		List<PizzaDTO> pizzas = pizzasEntity.stream().map(pizzaEntity -> mapToModel(pizzaEntity)).collect(Collectors.toList());
		
		return pizzas;
	}
	
	private PizzaDTO mapToModel(PizzaEntity pizzaEntity) {
		PizzaDTO pizzaDTO = new PizzaDTO();
		
		pizzaDTO.setId(pizzaEntity.getId());
		pizzaDTO.setNome(pizzaEntity.getNome());
		pizzaDTO.setDescricao(pizzaEntity.getDescricao());
		pizzaDTO.setPreco(pizzaEntity.getPreco());
		
		return pizzaDTO;
	}
}
