
public class Main {
    public static void main(String[] args) {

        Product laptop = new Product("Gaming Laptop", 1500);

        Payment paymentMethod = new CreditCardPayment();

        Delivery deliveryMethod = new ExpressDelivery();

        CourierService courierService = new CourierService(paymentMethod, deliveryMethod);

        courierService.completeOrder(laptop);

        Review productReview = new ProductReview();
        productReview.submitReview("The laptop is amazing! Fast performance and great build quality.");
    }
}
