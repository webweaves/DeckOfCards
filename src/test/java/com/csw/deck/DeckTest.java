package com.csw.deck;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeckTest {
	
	@Test
	public void checkDeckSize() {
		Deck deck = new Deck();
		assertEquals(deck.getCards().size(), 52);
	}
	
	@Test
	public void checkShuffleDeck() {
/*		
 * 		Work in progress		
 * 
 * 		Deck deck = new Deck();
		deck.shuffle();
		Card card1 = deck.dealCard();
		Card card2 = deck.dealCard();
		deck.removeCards(47);
		Card card3 = deck.dealCard();
		Card card4 = deck.dealCard();
		assertNotSame(card1, new Card(CardValue.TWO, Suit.CLUB));*/
	}
	
	public static void main(String[] args) {
	}
}
