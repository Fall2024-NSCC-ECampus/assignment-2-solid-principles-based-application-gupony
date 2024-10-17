public class CourierService {
    private Payment paymentMethod;
    private Delivery deliveryMethod;

    public CourierService(Payment paymentMethod, Delivery deliveryMethod) {
        this.paymentMethod = paymentMethod;
        this.deliveryMethod = deliveryMethod;
    }

    public void completeOrder(Product product) {
        System.out.println("Preparing to process your order...");
        paymentMethod.executePayment(product);
        deliveryMethod.startTracking();
        System.out.println("Thank you for your order! It’s now being processed.");
    }
}
