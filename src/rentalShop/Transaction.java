package rentalShop;

public class Transaction implements Rent {

    private int transactionId;
    private String transctionDate;
    private String returnDate;
    private double priceToPay;

    public int getTransactionId() {
        return transactionId;
    }

    public String getTransctionDate() {
        return transctionDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public double getPriceToPay() {
        return priceToPay;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setTransctionDate(String transctionDate) {
        this.transctionDate = transctionDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setPriceToPay(double priceToPay) {
        this.priceToPay = priceToPay;
    }

    public void reserveMovie(Customer customer, Movie movie) {
        if(!movie.getIsAvailable()) {
            setTransactionId(1);
            setTransctionDate("2023-12-06");
//            String cx = ((String) customer.getCustomerName());
//            String mv = ((String) movie.getMovieName());
            movie.setIsAvailable(false);

            System.out.println("The movie has been reserved");
        } else {
            System.out.println("The movie is available for renting right now");
        }
    }



    @Override
    public void rent(Customer customer, Movie movie, String date) {
        Transaction rentTransaction = new Transaction();
        if (movie.getIsAvailable()) {
            rentTransaction.setTransactionId(1);
            rentTransaction.setTransctionDate("2023-12-06");
            rentTransaction.setReturnDate("2023-12-09");
            movie.setIsAvailable(false);
            String lb = movie.getLabel();
            if(lb.equals("A")){
                rentTransaction.setPriceToPay(5.99);
            } else {
                rentTransaction.setPriceToPay(3.99);
            }
            System.out.printf("The movie %s%n is rented on %s%n for the customer %s%n", movie.getMovieName(), rentTransaction.getTransctionDate(), customer.getCustomerName());
            System.out.printf("This movie is label %s%n and the total owned is € %s%n", movie.getLabel(), rentTransaction.getPriceToPay());
        } else {
            System.out.println("The movie is not available");
        }
    }

    @Override
    public void rentReturn(Transaction id, String date, Movie movie, Customer customer) {

    }
}
