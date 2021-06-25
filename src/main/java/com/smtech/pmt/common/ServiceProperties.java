package com.smtech.pmt.common;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("pmt.common")
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ServiceProperties {
	private String	message;
	private String	protocol;
}
