package edu.csumb.mleon.heroservice.herodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import edu.csumb.mleon.heroservice.entities.Hero;

public interface IHeroDB extends MongoRepository<Hero, String> {

}