package com.places.world.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.places.world.entity.LoginPer;

public interface LoginRepo extends JpaRepository<LoginPer, String>{

}
