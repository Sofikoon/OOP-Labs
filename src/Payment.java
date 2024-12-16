public abstract class Payment {
    protected double amount;
    protected String currency;

    public Payment(double amount, String currency) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public abstract void processPayment();
}
