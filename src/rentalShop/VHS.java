package rentalShop;

public class VHS extends Movie {

    private int movieId;
    private boolean isRewind;

    @Override
    public void rent(Customer customer, Movie name) {

    }

    @Override
    public void isReturned(Movie name) {

    }

    @Override
    public void reserve(Customer customer, Movie name) {
        System.out.println(String.format("The movie s% has been reserved for s%", getMovieName(), customer));

    }

    public boolean getIsRewind() {
        return isRewind;
    }

    public void setIsRewind(boolean isRewind) {
        this.isRewind = isRewind;
    }
}
