public class BankTransferPayment extends Payment {
    private String bankAccount;

    public BankTransferPayment(double amount, String currency, String bankAccount) throws IllegalArgumentException {
        super(amount, currency);
        if (bankAccount == null || bankAccount.isEmpty()) {
            throw new IllegalArgumentException("Bank account cannot be empty.");
        }
        this.bankAccount = bankAccount;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing bank transfer of " + amount + " " + currency + " to account: " + bankAccount);
    }
}