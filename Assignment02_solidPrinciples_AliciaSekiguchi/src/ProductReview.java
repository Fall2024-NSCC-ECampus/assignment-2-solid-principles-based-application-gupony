public class ProductReview implements Review {
    @Override
    public void submitReview(String reviewText) {
        System.out.println("Your review for the product has been recorded: " + reviewText);
    }
}
