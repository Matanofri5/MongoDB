package project.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import project.beans.Person;

public interface PersonRepo extends MongoRepository<Person, Long>{

}
