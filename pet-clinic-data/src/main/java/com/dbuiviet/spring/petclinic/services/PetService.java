package com.dbuiviet.spring.petclinic.services;

import com.dbuiviet.spring.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet savePet(Pet pet);

    Set<Pet> findAll();
}
