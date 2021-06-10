package com.matwer.pokemon;

public class Pokedex extends AbstractPokemon {
	
	public void listPokemon() {
		for (int i= 0; i < deck.size(); i++) {
			System.out.println(deck.get(i));
		}
	}
	
}
