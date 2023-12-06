package rentalShop;

public class Main {

    public static void main(String [] args) {

        VHS movie1 = new VHS();
        movie1.setMovieName("The Godfather");
        movie1.setGender("Drama");
        movie1.setDirector("Francis Ford Coppola");
        movie1.setLanguage("English");
        movie1.setIsAwarded(true);
        movie1.setLabel("A");
        movie1.setIsAvailable(true);
        movie1.setIsRewind(true);

        Customer cust1 = new Customer();
        cust1.setCustomerName("Dan Brown");
        cust1.setAccNumb(1);

        Transaction transaction = new Transaction();

//        System.out.println(movie1.getIsAvailable());
//        transaction.reserveMovie(cust1, movie1);
//        System.out.println(movie1.getIsAvailable());

        transaction.rent(cust1, movie1, "2023-12-06");

    }

}
