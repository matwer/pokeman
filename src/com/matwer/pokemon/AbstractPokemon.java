package com.matwer.pokemon;

import java.util.ArrayList;

public abstract class AbstractPokemon implements PokemonInterface {
	ArrayList<String> deck = new ArrayList<String>();
	
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon p = new Pokemon();
		
		p.setName(name);
		p.setHealth(health);
		p.setType(type);
		
		deck.add(name);
		
		return p;
	}
	
	public void pokemonInfo(Pokemon p) {
		System.out.println("Name: " + p.getName() + "\nHealth: " + p.getHealth() + "\nType: " + p.getType());
	}

	public void listPokemon() {
	}

}
