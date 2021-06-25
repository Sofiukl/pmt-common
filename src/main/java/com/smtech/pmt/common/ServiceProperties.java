package com.smtech.pmt.common;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("common")
public class ServiceProperties {

	/**
	 * A message for the service.
	 */
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
