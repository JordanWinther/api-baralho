package com.api.baralho.aplication.Exception;

public class ConexaoFailException  extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConexaoFailException(String message) {
		super(message);
	}
	
	public ConexaoFailException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
	

}
