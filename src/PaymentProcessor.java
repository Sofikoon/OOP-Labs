import java.util.ArrayList;

// Клас для обробки масиву платежів
public class PaymentProcessor {
    private ArrayList<Payment> payments;

    public PaymentProcessor() {
        payments = new ArrayList<>();
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public void processAllPayments() {
        for (Payment payment : payments) {
            try {
                payment.processPayment();
            } catch (Exception e) {
                System.out.println("Error processing payment: " + e.getMessage());
            }
        }
    }
}
