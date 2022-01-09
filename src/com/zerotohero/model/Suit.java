package com.zerotohero.model;

public enum Suit {
	DIAMOND(1) , HEARTS(2), SPADES(3), CLUBS(4);
	
	int suit;
	
	private Suit(int value) {
		suit = value;
	}
	public int value() {
		return suit;
	}

}
