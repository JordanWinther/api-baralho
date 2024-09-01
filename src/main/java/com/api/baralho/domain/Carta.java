package com.api.baralho.domain;

import java.util.List;

public class Carta {
	
	protected String code;
	protected String image;
	//protected List<Image> images;
	protected String value;
	protected String suit;
    
    
    
    
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
//	public List<Image> getImages() {
//		return images;
//	}
//	public void setImages(List<Image> images) {
//		this.images = images;
//	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
    
    
    
}
