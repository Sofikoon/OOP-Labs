public class Main {
    public static void main(String[] args) {
        try {
            PaymentProcessor processor = new PaymentProcessor();

            // Додаємо різні платежі з валютою
            processor.addPayment(new CreditCardPayment(150.0, "USD", "1234-5678-9012-3456"));
            processor.addPayment(new PayPalPayment(276.50, "EUR", "sofikkon06@gmail.com"));
            processor.addPayment(new BankTransferPayment(3333.33, "UAH", "UA123456789"));

            // Обробляємо всі платежі
            processor.processAllPayments();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}