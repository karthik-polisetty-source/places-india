package com.places.world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.places.world.entity.AddNewPlaces;
import com.places.world.service.AddPlaceService;

@RestController
@RequestMapping("/places/world")
public class AddPlaceController {
	
	@Autowired
	AddPlaceService addService;
	
	@PostMapping("/add")
	public AddNewPlaces insertPlace(@RequestBody AddNewPlaces Places)
	{
		return addService.addPlace(Places);
	}

	@PostMapping("/all")
	public List<AddNewPlaces> showPlace(@RequestBody  List<AddNewPlaces> aplaces)
	{
		return addService.allPlaces(aplaces);
	}
}
