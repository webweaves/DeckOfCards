package com.csw.deck;

public class DeckTest {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		deck.dumpDeck();
		
		deck.shuffle();
		
		System.out.println("");
		
		deck.dumpDeck();
		
		System.out.println("");
			
		while (deck.getCards().size() != 0) {
			Card c = deck.popCard();
			System.out.println("Popped " + c);
			deck.dumpDeck();
			System.out.println("");
		}
	}
}
