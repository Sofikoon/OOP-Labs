public class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String currency, String email) throws IllegalArgumentException {
        super(amount, currency);
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of " + amount + " " + currency + " for email: " + email);
    }
}
