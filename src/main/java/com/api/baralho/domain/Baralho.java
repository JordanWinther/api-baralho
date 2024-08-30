package com.api.baralho.domain;


public class Baralho {

	private boolean success;
    private String deck_id;
    private int remaining;
    private boolean shuffled;
    
    
    
    
	public Baralho() {
		super();
	}
	public Baralho(boolean success, String deck_id, int remaining, boolean shuffled) {
		super();
		this.success = success;
		this.deck_id = deck_id;
		this.remaining = remaining;
		this.shuffled = shuffled;
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
	public int getRemaining() {
		return remaining;
	}
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	public boolean isShuffled() {
		return shuffled;
	}
	public void setShuffled(boolean shuffled) {
		this.shuffled = shuffled;
	}
    
    
}
