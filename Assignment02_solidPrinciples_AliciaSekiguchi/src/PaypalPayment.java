public class PaypalPayment implements Payment {
    @Override
    public void executePayment(Product product) {
        System.out.println("Initiating PayPal payment for: " + product.getProductName() + ".");
        System.out.println("Your PayPal payment has been successfully processed!");
    }
}
