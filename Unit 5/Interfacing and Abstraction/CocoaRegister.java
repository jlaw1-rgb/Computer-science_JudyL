
import java.util.ArrayList;

public class CocoaRegister {

    public static final double TAX_RATE = 0.0875;

    private ArrayList<Sellable> items;
    private ArrayList<Integer> quantities;

    public CocoaRegister() {
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addItem(Sellable item, int quantity) {
        if (item != null && quantity > 0) {
            items.add(item);
            quantities.add(quantity);
        }
    }

    public double getSubtotal() {
        double sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum = sum + (items.get(i).getBasePrice() * quantities.get(i));
        }
        return ChocolateBar.round2(sum);
    }

    public double getTax() {
        double tax = getSubtotal() * TAX_RATE;
        return ChocolateBar.round2(tax);
    }

    public double getTotal() {
        return ChocolateBar.round2(getSubtotal() + getTax());
    }

    public void printReceipt() {
        System.out.println("== COCOA CORNER ==");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getName()
                    + " x" + quantities.get(i) + " @ $"
                    + ChocolateBar.money(items.get(i).getBasePrice()) + " = $"
                    + ChocolateBar.money(quantities.get(i) * items.get(i).getBasePrice()));
        }
        System.out.println("Subtotal: $" + ChocolateBar.money(getSubtotal()));
        System.out.println("Tax: $" + ChocolateBar.money(getTax()));
        System.out.println("Total: $" + ChocolateBar.money(getTotal()));
    }

}
