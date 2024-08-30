package com.places.world.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.places.world.entity.AddNewPlaces;
import com.places.world.repo.AddPlacesRepo;

@Service
public class AddPlaceService {
	
	@Autowired
	AddPlacesRepo addRepo;

	public AddNewPlaces addPlace(AddNewPlaces places) {

		return addRepo.save(places);
	}

	public List<AddNewPlaces> allPlaces(List<AddNewPlaces> aplaces) {
		
		return addRepo.saveAll(aplaces);
	}

	
	
}
