package com.csw.deck;

public enum CardValue {
	
	TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("T"), JACK("J"), QUEEN("Q"), KING("K"), ACE("A");
	
	private String value;
	
	CardValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
