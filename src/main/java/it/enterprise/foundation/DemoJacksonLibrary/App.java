package it.enterprise.foundation.DemoJacksonLibrary;

import java.io.IOException;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	private static Logger log = Logger.getLogger(App.class.getSimpleName());

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();

		String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

		try {
			Car car = objectMapper.readValue(carJson, Car.class);

			System.out.println("car brand = " + car.getBrand());
			System.out.println("car doors = " + car.getDoors());
		} catch (IOException e) {
			log.info("ERROR in method readValue(carJson, Car.class)");
			e.printStackTrace();
		}
	}
}
