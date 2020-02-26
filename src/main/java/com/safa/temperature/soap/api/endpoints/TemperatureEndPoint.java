package com.safa.temperature.soap.api.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.safa.temperature.soap.api.services.TemperatureService;
import com.safa.temperature.soap.api.temperaturerequestresponse.MinTemperatureRequest;
import com.safa.temperature.soap.api.temperaturerequestresponse.MinTemperatureResponse;

@Endpoint
public class TemperatureEndPoint {
	
	public final String NAMESPACE="http://www.safa.com/temperature/soap/api/temperatureRequestResponse" ;
	
	@Autowired
	TemperatureService service;
	
	 @PayloadRoot(localPart = "MinTemperatureRequest", namespace = NAMESPACE)
	 @ResponsePayload
	public MinTemperatureResponse getMinTemperature(@RequestPayload MinTemperatureRequest request) {
		return service.min(request);
	}

}
