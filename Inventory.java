import java.util.List;

public class Inventory {
    private List<Item> items;

    public int getItemCount() {
        return items.size();
    }

    public void generateBill(Billable b) {
        // ...
    }

    public void add(Item s) {
        items.add(s);
    }
}
