package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBase {

    private  List<Movie> allmovies = new ArrayList<>();

    private  List<Actor> allactors = new ArrayList<>();

    public  void addMovie(Movie movie) {
        allmovies.add(movie);
    }

    public  void addActor(Actor actor) {
        allactors.add(actor);
    }

    public  List<Movie> getMovies() {
        return allmovies;
    }

    public  List<Actor> getActors() {
        return allactors;
    }

    public  List<Actor> noMovie() {
        List<Actor> resultList = new ArrayList<>();

        Iterator actorIterator = getActors().iterator();
        while (actorIterator.hasNext()) {
            Actor actor = (Actor) actorIterator.next();

            Iterator movieIterator = getMovies().iterator();
            boolean flag = false;
            while (movieIterator.hasNext()) {
                Movie movie = (Movie) movieIterator.next();
                if (movie.getActors().contains(actor)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                resultList.add(actor);
            }



        }
    
    return resultList;
}



    public List<Actor> getActorsWhoWorkTogether (Actor actor) {
        List<Actor> resultList = new ArrayList<>();

        for (Iterator<Movie> movieIterator = allmovies.iterator(); movieIterator.hasNext(); ) {
            Movie someMovie = movieIterator.next();
            if (someMovie.getActors().contains(actor)) {
                    for (Iterator<Actor> actorIterator = someMovie.getActors().listIterator(); actorIterator.hasNext(); ) {
                        Actor nextActor = actorIterator.next();
                        if (nextActor instanceof Actor) {
                            Actor someActor =  nextActor;
                            if (!(someActor.equals(actor) || resultList.contains(someActor))) resultList.add(someActor);
                        }
                    }
                }
            }

        return resultList;
    }



    public Movie getMoviesWithTheLargestNumberOfActors() {
        Movie maxActors = allmovies.get(0);
        for (Movie someMovie : allmovies) {
            if (someMovie.getActors().size() > maxActors.getActors().size()) {
                maxActors = someMovie;
            }
        }
        return maxActors;
    }
}





