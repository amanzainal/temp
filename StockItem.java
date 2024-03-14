public class StockItem extends Item {
    private Review review;
    private String name;

    public StockItem(
        String name, Rating rating) {

        this.name = name;
        this.review = new Review(rating);
    }

    @Override
    public void print() {
        //...
    }

    @Override
    public void bill() {
        //...
    }
}
