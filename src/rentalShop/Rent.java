package rentalShop;

public interface Rent {

    public void rent(Customer customer, Movie name, String date);

    public void rentReturn(Transaction id, String date, Movie movie, Customer customer);

}
