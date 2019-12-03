package com.dbuiviet.spring.petclinic.services;

import com.dbuiviet.spring.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet savePet(Vet vet);

    Set<Vet> findAll();
}
