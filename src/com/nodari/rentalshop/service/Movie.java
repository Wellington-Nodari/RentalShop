package com.nodari.rentalshop.service;

public abstract class Movie {

    private String movieName;
    private String gender;
    private String director;
    private String language;
    private double movieLength;
    private boolean isAwarded;
    private String label;
    private boolean isAvailable;

    public Movie(String movieName, String gender, String director, String language, double movieLength, boolean isAwarded, String label, boolean isAvailable) {
        this.movieName = movieName;
        this.gender = gender;
        this.director = director;
        this.language = language;
        this.movieLength = movieLength;
        this.isAwarded = isAwarded;
        this.label =label;
        this.isAvailable = isAvailable;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGender() {
        return gender;
    }

    public String getDirector() {
        return director;
    }

    public String getLanguage() {
        return language;
    }

    public double getMovieLength() {
        return movieLength;
    }

    public boolean getIsAwarded() {
        return isAwarded;
    }

    public String getLabel() {
        return label;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }


    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    public void setIsAwarded(boolean isAwarded) {
        this.isAwarded = isAwarded;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
