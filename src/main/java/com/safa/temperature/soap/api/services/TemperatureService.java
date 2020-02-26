package com.safa.temperature.soap.api.services;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.safa.temperature.soap.api.temperaturerequestresponse.MinTemperatureRequest;
import com.safa.temperature.soap.api.temperaturerequestresponse.MinTemperatureResponse;

@Service
public class TemperatureService {

	public MinTemperatureResponse min(MinTemperatureRequest request) {

		MinTemperatureResponse response = new MinTemperatureResponse();
		List<Integer> liste = request.getTemperatures();
		liste.sort(Comparator.naturalOrder());
		response.setResTemp(liste.get(0));
		return response;

	}

}
