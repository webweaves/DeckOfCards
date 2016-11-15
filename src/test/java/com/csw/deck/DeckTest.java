package com.csw.deck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class DeckTest {
	
	@Test
	public void checkDeckSize() {
		Deck deck = new Deck();
		assertEquals(deck.getCards().size(), 52);
	}
	
	@Test
	public void checkShuffleDeck() {
 		Deck deck = new Deck();
		deck.shuffle();
		Card card1 = deck.dealCard();
		Card card2 = deck.dealCard();
		//get the last two cards from the deck
		deck.removeCards(47);
		Card card3 = deck.dealCard();
		Card card4 = deck.dealCard();
		//if the deck has been shuffled the cards will never still be in order
		assertFalse(card1.equals(new Card(CardValue.TWO, Suit.CLUBS)));
		assertFalse(card2.equals(new Card(CardValue.THREE, Suit.CLUBS)));
		assertFalse(card3.equals(new Card(CardValue.KING, Suit.SPADES)));
		assertFalse(card4.equals(new Card(CardValue.ACE, Suit.SPADES)));
	}
}
