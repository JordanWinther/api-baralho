package com.api.baralho.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class CompraCartaResponse {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private boolean success;
    private String deck_id;
    @OneToMany(cascade = CascadeType.ALL)
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
