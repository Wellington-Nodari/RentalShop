package rentalShop;

public abstract class Movie implements IMovie {

    private String movieName;
    private String gender;
    private String director;
    private String language;
    private int movieLength;
    private boolean isAwarded;
    private String label;
    private boolean isAvailable;


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

    public int getMovieLength() {
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
