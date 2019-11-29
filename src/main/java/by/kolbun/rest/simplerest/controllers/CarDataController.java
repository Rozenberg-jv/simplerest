package by.kolbun.rest.simplerest.controllers;

import by.kolbun.rest.simplerest.model.Car;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
@CrossOrigin
public class CarDataController {

	@GetMapping("/cars")
	public List<Car> getCars() {

		return List.of(new Car(1, "Audi", "blue"));
	}
}
