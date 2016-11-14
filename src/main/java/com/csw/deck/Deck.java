package com.csw.deck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {

	private Collection<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
		for (Suit s: Suit.values()) {
			for (CardValue c: CardValue.values()) {
				cards.add(new Card(c, s));
			}
		}
	}

	public void shuffle() {
		Collections.shuffle((List<Card>) cards);
	}
	
	public Card popCard() {
		return (Card)((List<Card>)cards).remove(0);
	}
	
	public void dumpDeck() {
		for (Card c: getCards()) {
			System.out.print(c);
		}
	}
	
	public Collection<Card> getCards() {
		return cards;
	}
	public void setCards(Collection<Card> cards) {
		this.cards = cards;
	}
}