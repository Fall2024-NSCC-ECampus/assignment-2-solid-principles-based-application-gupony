public class StandardDelivery extends Delivery {
    @Override
    public void startTracking() {
        System.out.println("Standard delivery has started. Your package will arrive soon.");
    }
}
