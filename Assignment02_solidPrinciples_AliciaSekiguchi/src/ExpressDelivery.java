public class ExpressDelivery extends Delivery {
    @Override
    public void startTracking() {
        System.out.println("Your express delivery is on its way, arriving faster than usual!");
    }
}
