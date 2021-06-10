package com.matwer.pokemon;

public interface PokemonInterface {
	Pokemon createPokemon(String name, int health, String type);
	
	public void pokemonInfo(Pokemon p);

	public void listPokemon();
}
