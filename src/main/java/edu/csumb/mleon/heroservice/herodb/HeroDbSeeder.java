package edu.csumb.mleon.heroservice.herodb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.csumb.mleon.heroservice.entities.AlterEgo;
import edu.csumb.mleon.heroservice.entities.Hero;
import edu.csumb.mleon.heroservice.entities.Identity;
import edu.csumb.mleon.heroservice.entities.Powers;
import edu.csumb.mleon.heroservice.herodb.IHeroDB;

@Component // annotation
public class HeroDbSeeder implements CommandLineRunner{
    @Autowired
    IHeroDB heroRepo;

    @Override
    public void run(String... args) throws Exception {
        Hero ironMan = new Hero(new Identity("Tony Stark"), new AlterEgo("Iron Man"), new Powers(Arrays.asList("energy beams","flight")));
        Hero hulk = new Hero(new Identity("Bruce Banner"), new AlterEgo("The Hulk"), new Powers(Arrays.asList("super strength")));
        Hero spiderMan = new Hero(new Identity("Peter Parker"), new AlterEgo("Spider Man"), new Powers(Arrays.asList("super strength","webs","danger sense")));
        //delete db data
        heroRepo.deleteAll();
        //add db seeds
        List<Hero> heroes = Arrays.asList(ironMan, hulk, spiderMan);
        heroRepo.saveAll(heroes);
    }
}