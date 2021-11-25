package com.company;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    public Movie(String name) {
        this.name = name;
    }

    private List<Actor> actors = new ArrayList<>();

    public void addActor(Actor actor) {
        this.actors.add(actor);
    }

    public List<Actor> getActors() {
        return this.actors;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", actors=" + actors +
                '}';
    }
}

