package com.arm.atm.exceptions.bank;

public class BankJaExistenteException extends RuntimeException {

	private static final long serialVersionUID = -1872503250066522971L;

	public BankJaExistenteException (String mensagem) {
		super(mensagem);
	}

	public BankJaExistenteException (String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
