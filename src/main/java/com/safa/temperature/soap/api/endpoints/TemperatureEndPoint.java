package com.safa.temperature.soap.api.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.safa.temperature.soap.api.services.TemperatureService;
import com.safa.temperature.soap.api.temperaturerequestresponse.AvgTemperatureRequest;
import com.safa.temperature.soap.api.temperaturerequestresponse.AvgTemperatureResponse;
import com.safa.temperature.soap.api.temperaturerequestresponse.ClosestToZeroTemperatureRequest;
import com.safa.temperature.soap.api.temperaturerequestresponse.ClosestToZeroTemperatureResponse;
import com.safa.temperature.soap.api.temperaturerequestresponse.MaxTemperatureRequest;
import com.safa.temperature.soap.api.temperaturerequestresponse.MaxTemperatureResponse;
import com.safa.temperature.soap.api.temperaturerequestresponse.MinTemperatureRequest;
import com.safa.temperature.soap.api.temperaturerequestresponse.MinTemperatureResponse;

@Endpoint
public class TemperatureEndPoint {

	public final String NAMESPACE = "http://www.safa.com/temperature/soap/api/temperatureRequestResponse";

	@Autowired
	TemperatureService service;

	@PayloadRoot(localPart = "MinTemperatureRequest", namespace = NAMESPACE)
	@ResponsePayload
	public MinTemperatureResponse getMinTemperature(@RequestPayload MinTemperatureRequest request) {
		return service.min(request);
	}

	@PayloadRoot(localPart = "MaxTemperatureRequest", namespace = NAMESPACE)
	@ResponsePayload
	public MaxTemperatureResponse getMaxTemperature(@RequestPayload MaxTemperatureRequest request) {
		return service.max(request);
	}

	@PayloadRoot(localPart = "AvgTemperatureRequest", namespace = NAMESPACE)
	@ResponsePayload
	public AvgTemperatureResponse getAvgTemperature(@RequestPayload AvgTemperatureRequest request) {
		return service.avg(request);
	}

	@PayloadRoot(localPart = "ClosestToZeroTemperatureRequest", namespace = NAMESPACE)
	@ResponsePayload
	public ClosestToZeroTemperatureResponse getClosestToZeroTemperature(@RequestPayload ClosestToZeroTemperatureRequest request) {
		return service.ClosestToZero(request);
	}

}
