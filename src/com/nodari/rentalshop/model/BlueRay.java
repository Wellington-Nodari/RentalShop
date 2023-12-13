package com.nodari.rentalshop.model;

import com.nodari.rentalshop.service.Movie;

public class BlueRay extends Movie {

    private int movieId;

    public BlueRay(int movieId, String movieName, String gender, String director, String language, double movieLength, boolean isAwarded, String label, boolean isAvailable) {
        super(movieName, gender, director, language, movieLength, isAwarded, label, isAvailable);

        this.movieId = movieId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
