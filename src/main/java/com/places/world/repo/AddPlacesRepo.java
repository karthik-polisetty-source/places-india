package com.places.world.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.places.world.entity.AddNewPlaces;

public interface AddPlacesRepo extends JpaRepository<AddNewPlaces, String>{

}
