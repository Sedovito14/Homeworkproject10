package netology.ru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviePosterTest {
    @Test
    public void shouldFindAll() {
        MoviePoster moviePoster = new MoviePoster();
        String movie1 = "Film1";
        String movie2 = "Film2";
        String movie3 = "Film3";

        moviePoster.add(movie1);
        moviePoster.add(movie2);
        moviePoster.add(movie3);
        String[] actual = moviePoster.findAll();
        String[] expected = {movie1, movie2, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast1() {
        MoviePoster moviePoster = new MoviePoster(12);
        String movie1 = "Film1";
        String movie2 = "Film2";
        String movie3 = "Film3";

        moviePoster.add(movie1);
        moviePoster.add(movie2);
        moviePoster.add(movie3);
        String[] actual = moviePoster.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast3() {
        MoviePoster moviePoster = new MoviePoster();
        String movie1 = "Film1";
        String movie2 = "Film2";
        String movie3 = "Film3";
        String movie4 = "Film4";
        String movie5 = "Film5";
        String movie6 = "Film6";
        String movie7 = "Film7";

        moviePoster.add(movie1);
        moviePoster.add(movie2);
        moviePoster.add(movie3);
        moviePoster.add(movie4);
        moviePoster.add(movie5);
        moviePoster.add(movie6);
        moviePoster.add(movie7);
        String[] actual = moviePoster.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }
}
