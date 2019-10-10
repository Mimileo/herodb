package edu.csumb.mleon.heroservice.entities;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Heroes")
public class Hero {
    private String id;
    private Identity identity;
    private AlterEgo alterEgo;
    private Powers powers;

    public Hero (Identity identity, AlterEgo alterEgo, Powers powers) {
        this.identity = identity;
        this.alterEgo = alterEgo;
        this.powers = powers;
    }

    public String getId () {
        return this.id;
    }

    public Identity getIdentity () {
        return this.identity;
    }

    public AlterEgo getAlterEgo () {
        return this.alterEgo;
    }

    public Powers getPowers () {
        return this.powers;
    }
}