package BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsThreatre;
    List<Theatre> allTheatre;

    TheatreController() {
        cityVsThreatre = new HashMap<>();
        allTheatre = new ArrayList<>();
    }

    void addThreatre(Theatre theatre, City city){
        allTheatre.add(theatre);

        List<Theatre> theatreList = cityVsThreatre.getOrDefault(city, new ArrayList<>());
        theatreList.add(theatre);
        cityVsThreatre.put(city, theatreList);
    }

    Map<Theatre, List<Show>> getAllShow(Movie movie, City city) {
        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

        List<Theatre> theatres = cityVsThreatre.get(city);

        for(Theatre theatre : theatres) {

            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();

            for(Show show : shows) {
                if(show.movie.getMovieId() == movie.getMovieId()) {
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()) {
                theatreVsShows.put(theatre, givenMovieShows);
            }
        }




        return theatreVsShows;
    }
}
