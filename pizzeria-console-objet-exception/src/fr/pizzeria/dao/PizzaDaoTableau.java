package fr.pizzeria.dao;

import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza;

public class PizzaDaoTableau implements PizzaDao{
	
	private Pizza[] pizzas = {
			new Pizza(0, "PEP", "peperoni", 12.50)
	};

	@Override
	public Pizza[] findAll() {
		return pizzas;
	}

	@Override
	public void save(Pizza p) throws SavePizzaException {
		if(!isValid(p)){
			throw new SavePizzaException();
		}
		Pizza pizzaToAdd = new Pizza(pizzas.length, p.getCode(), p.getNom(), p.getPrix());
		
		Pizza[] pizzaTemp = new Pizza[pizzas.length+1];
		
		for (int listeur = 0; listeur < pizzas.length; listeur++) {
			pizzaTemp[listeur] = pizzas[listeur];
		}
			pizzaTemp[pizzas.length] = pizzaToAdd;
			pizzas = pizzaTemp;
			
	}

	private boolean isValid(Pizza p) {
		return p != null && p.getCode() != null && !p.getCode().isEmpty();
	}

	@Override
	public void updatePizza(int id, Pizza p) throws UpdatePizzaException {

		if(!isValid(p)){
			throw new UpdatePizzaException();
		}
		pizzas[id] = p;
	}

	@Override
	public void deletePizza(int id) {
		
		Pizza[] pizzaTemp = new Pizza[pizzas.length - 1];
		int index = 0;
		for (int listeur = 0; listeur < pizzas.length; listeur++) {
			if(pizzas[listeur] != pizzas[id]){
				pizzaTemp[index] = pizzas[listeur];
				index++;
			}
		}
		
		pizzas = pizzaTemp;
	}

}