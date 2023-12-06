package rentalShop;

public interface IMovie {

    public void rent(Customer customer, Movie name);

    public void isReturned(Movie name);

    public void reserve(Customer customer, Movie name);

}
