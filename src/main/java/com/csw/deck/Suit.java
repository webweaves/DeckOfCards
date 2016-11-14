package com.csw.deck;

public enum Suit {
	CLUB("C"), DIAMONDS("D"), HEARTS("H"), SPADES("S");
	
	private String suit;
	
	Suit(String suit) {
		this.suit = suit;
	}

	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	@Override
	public String toString() {
		return suit;
	}
}
