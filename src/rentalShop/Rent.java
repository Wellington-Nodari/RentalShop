package rentalShop;

public interface Rent {

    public void rent(Customer customer, Movie name, String date);

    public void rentReturn(int id, String date, Movie movie, Customer customer);

}
