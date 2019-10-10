// api
package edu.csumb.mleon.heroservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.mleon.heroservice.herodb.IHeroDB;
import edu.csumb.mleon.heroservice.entities.Hero;


// treat as restful endpoint
@RestController
public class HeroController {

    @Autowired
    IHeroDB heroRepository;
   
    @GetMapping("/Heroes") // Mapping to get to this URL/ HTTP GET- how you call end ponint
    @ResponseBody// what end point is returning
    String getHeroes (){
        return "Hello World";
    }

    @GetMapping("/allHeroes")
    public List<Hero> getAll () {
        List<Hero> result = heroRepository.findAll();
        return result;

    }
}