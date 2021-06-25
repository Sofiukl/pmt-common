package com.smtech.pmt.common.exception;

public class RestServiceException extends Exception {
	private static final long serialVersionUID = 1L;

	public RestServiceException(String message) {
		super(message);
	}

	public RestServiceException(String message, Throwable th) {
		super(message, th);
	}

}
