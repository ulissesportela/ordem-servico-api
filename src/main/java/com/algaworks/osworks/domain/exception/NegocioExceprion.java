package com.algaworks.osworks.domain.exception;

public class NegocioExceprion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NegocioExceprion(String message) {
		super(message);
	}
}
