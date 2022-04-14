package com.smtech.pmt.common;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties("pmt.common")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ServiceProperties {
	private String	message;
	private String	protocol;
}
