package com.arm.atm.exception;

public class AccountExistenteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountExistenteException(String mensagem) {
		super(mensagem);
	}

	public AccountExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
}

}
