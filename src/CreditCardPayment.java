public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String currency, String cardNumber) throws IllegalArgumentException {
        super(amount, currency);
        if (cardNumber == null || cardNumber.isEmpty()) {
            throw new IllegalArgumentException("Card number cannot be empty.");
        }
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of " + amount + " " + currency + " with card number: " + cardNumber);
    }
}