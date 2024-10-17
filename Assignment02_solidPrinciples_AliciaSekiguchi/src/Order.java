public class Order {
    private Product orderedProduct;

    public Order(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    public void confirmOrder() {
        System.out.println("Your order for " + orderedProduct.getProductName() + " has been confirmed!");
        System.out.println("Expect delivery details shortly.");
    }
}
