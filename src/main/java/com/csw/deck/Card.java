package com.csw.deck;

public class Card {

	private CardValue cardValue;
	private Suit suit;
	
	public Card(CardValue cardValue, Suit suit) {
		this.cardValue = cardValue;
		this.suit = suit;
	}
	
	@Override
	public String toString() {
		return "" + cardValue + suit;
	}
	
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public CardValue getCardValue() {
		return cardValue;
	}
	public void setCardValue(CardValue cardValue) {
		this.cardValue = cardValue;
	}	
}