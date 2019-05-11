package com.arm.atm.exceptions.account;

public class AccountNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 341857314936700994L;

	public AccountNaoEncontradaException(String mensagem) {
		super(mensagem);
	}

	public AccountNaoEncontradaException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
