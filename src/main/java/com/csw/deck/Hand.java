package com.csw.deck;

import java.util.Collection;

public class Hand {

	private Integer numberOfCards;
	private Collection<CardValue> cards;
	
	public Hand(int numberOfCards) {
		this.setNumberOfCards(numberOfCards);
	}

	public Integer getNumberOfCards() {
		return numberOfCards;
	}
	public void setNumberOfCards(Integer numberOfCards) {
		this.numberOfCards = numberOfCards;
	}
	public Collection<CardValue> getCards() {
		return cards;
	}
	public void setCards(Collection<CardValue> cards) {
		this.cards = cards;
	}
}