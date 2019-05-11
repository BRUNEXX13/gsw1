package com.arm.atm.exceptions.account;

public class AccountJaExistenteException extends RuntimeException {

	private static final long serialVersionUID = -3460164587751661743L;

	public AccountJaExistenteException(String mensagem) {
		super(mensagem);
	}

	public AccountJaExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
