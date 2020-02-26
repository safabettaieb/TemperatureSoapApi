package com.safa.temperature.soap.api.services;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.safa.temperature.soap.api.temperaturerequestresponse.AvgTemperatureRequest;
import com.safa.temperature.soap.api.temperaturerequestresponse.AvgTemperatureResponse;
import com.safa.temperature.soap.api.temperaturerequestresponse.MaxTemperatureRequest;
import com.safa.temperature.soap.api.temperaturerequestresponse.MaxTemperatureResponse;
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

	public MaxTemperatureResponse max(MaxTemperatureRequest request) {

		MaxTemperatureResponse response = new MaxTemperatureResponse();
		List<Integer> liste = request.getTemperatures();
		liste.sort(Comparator.naturalOrder());
		response.setResTemp(liste.get(liste.size() - 1));
		return response;

	}
	public AvgTemperatureResponse avg(AvgTemperatureRequest request) {

		AvgTemperatureResponse response = new AvgTemperatureResponse();
		List<Integer> liste = request.getTemperatures();
		 Double average = liste.stream().mapToInt(val -> val).average().getAsDouble();
		response.setResTemp(average);
		return response;

	}

}
