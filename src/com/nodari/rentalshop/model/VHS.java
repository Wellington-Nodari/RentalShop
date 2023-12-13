package com.nodari.rentalshop.model;

import com.nodari.rentalshop.service.Movie;

public class VHS extends Movie {

    private int movieId;
    private boolean isRewind;

    public VHS(int movieId, String movieName, String gender, String director, String language, double movieLength, boolean isAwarded, String label, boolean isAvailable, boolean isRewind) {
        super(movieName, gender, director, language, movieLength, isAwarded, label, isAvailable);
        this.movieId = movieId;
        this.isRewind = isRewind;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public boolean getIsRewind() {
        return isRewind;
    }

    public void setIsRewind(boolean isRewind) {
        this.isRewind = isRewind;
    }
}
