public class CreditCardPayment implements Payment {
    @Override
    public void executePayment(Product product) {
        System.out.println("Processing credit card payment for: " + product.getProductName() + ".");
        System.out.println("Payment completed successfully using your credit card.");
    }
}
