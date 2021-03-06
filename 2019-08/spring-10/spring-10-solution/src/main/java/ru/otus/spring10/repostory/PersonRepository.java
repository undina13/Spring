package ru.otus.spring10.repostory;

import org.springframework.data.repository.CrudRepository;
import ru.otus.spring10.domain.Person;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {

    List<Person> findAll();

    Person findByName(String s);
}
