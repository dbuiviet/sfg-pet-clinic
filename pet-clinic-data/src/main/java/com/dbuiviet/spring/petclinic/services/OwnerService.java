package com.dbuiviet.spring.petclinic.services;

import com.dbuiviet.spring.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
