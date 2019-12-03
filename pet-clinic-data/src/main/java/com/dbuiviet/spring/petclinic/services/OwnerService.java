package com.dbuiviet.spring.petclinic.services;

import com.dbuiviet.spring.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner saveOwner(Owner owner);

    Set<Owner> findAll();
}
