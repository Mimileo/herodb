package edu.csumb.mleon.heroservice.entities;

import java.util.List;

public class Powers{
    private List<String> powers;

    public Powers (List<String> powers) {
        this.powers = powers;
    }

    public List<String> getPowers() {
        return this.powers;
    }
}