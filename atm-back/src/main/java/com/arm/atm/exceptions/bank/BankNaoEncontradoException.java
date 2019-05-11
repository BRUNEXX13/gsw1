package com.arm.atm.exceptions.bank;

public class BankNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = -679211631517779086L;

	public BankNaoEncontradoException(String mensagem) {
		super(mensagem);
	}

	public BankNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
