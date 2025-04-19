package com.seki.springdb.repositories;

import com.seki.springdb.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
