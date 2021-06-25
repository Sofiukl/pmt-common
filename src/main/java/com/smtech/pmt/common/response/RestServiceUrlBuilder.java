package com.smtech.pmt.common.response;

import com.smtech.pmt.common.ServiceProperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class RestServiceUrlBuilder {

	private static final Logger	logger	= LoggerFactory.getLogger(RestServiceUrlBuilder.class);
	private final ServiceProperties serviceProperties;

	private String				protocol;
	private String				serviceName;
	private String				resourceUrl;

	public RestServiceUrlBuilder(ServiceProperties serviceProperties) {
		this.serviceProperties = serviceProperties;
		this.protocol = this.serviceProperties.getProtocol();
	}

	public RestServiceUrlBuilder setProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	public RestServiceUrlBuilder setServiceName(String serviceName) {
		this.serviceName = serviceName;
		return this;
	}

	public RestServiceUrlBuilder setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
		return this;
	}

	public String buildUrl() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.protocol).append("://").append(this.serviceName).append("/").append(this.resourceUrl);
		logger.debug("{}", sb.toString());
		return sb.toString();
	}

}
