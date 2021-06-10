package com.matwer.pokemon;

public class PokeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokedex deck = new Pokedex();
		
		Pokemon bulbasaur = deck.createPokemon("bulbasaur", 100, "grass");
		Pokemon charmander = deck.createPokemon("charmander", 90, "fire");
		Pokemon squirtle = deck.createPokemon("squirtle", 95, "water");
		Pokemon pikachu = deck.createPokemon("pikachu", 100, "electric");
		
		System.out.println("List all pokemons in the deck:");
		deck.listPokemon();
		
		System.out.println("bulbasaur attacks pikachu...");
		bulbasaur.attackPokemon(pikachu);
		System.out.println("Show the info for bulbasaur and pikachu...");
		deck.pokemonInfo(bulbasaur);
		deck.pokemonInfo(pikachu);
	}
}
