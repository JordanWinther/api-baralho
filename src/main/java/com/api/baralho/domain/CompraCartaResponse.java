package com.api.baralho.domain;

import java.util.List;



public class CompraCartaResponse {

	private boolean success;
    private String deck_id;
    private List<Carta> cards;
    private int remaining;
    
    
    
	public CompraCartaResponse() {
		super();
	}
	
	public CompraCartaResponse(boolean success, String deck_id, List<Carta> cards, int remaining) {
		super();
		this.success = success;
		this.deck_id = deck_id;
		this.cards = cards;
		this.remaining = remaining;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getDeck_id() {
		return deck_id;
	}
	public void setDeck_id(String deck_id) {
		this.deck_id = deck_id;
	}
	public List<Carta> getCards() {
		return cards;
	}
	public void setCards(List<Carta> cards) {
		this.cards = cards;
	}
	public int getRemaining() {
		return remaining;
	}
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
    
}
