public class OrderTester {
    public static void main(String[] args) {
        Item[] items = new Item[] {
                new Item("Notebook", 3.50, 4),
                new Item("Backpack", 59.99, 1),
                new Item("Pencil", 0.99, 10),
                new Item("Calculator", 79.95, 1)
        };

        double taxRate = 0.09; // 9% tax

        test(items, taxRate, 163.84, 14.7456,
            178.5856, new String[] { "Backpack", "Calculator" });

        test(items, 0.15, 163.84, 24.576,
            188.416, new String[] { "Backpack", "Calculator" });
    
        OrderSummary summary = OrderProcessor.processCustomerOrder(items, taxRate);

        System.out.println("--- Order Summary ---");
        System.out.println("Subtotal: $" + summary.getSubtotal());
        System.out.println("Tax: $" + summary.getTax());
        System.out.println("Total: $" + summary.getTotal());

        String[] premium = summary.getExpensiveItems();
        System.out.println("Premium items (" + premium.length + "):");
        for (String item : premium) {
            System.out.println("- " + item);
        }
    }

    public static void test(Item[] items, double taxRate,
        double subtotal, double tax, double total, String[] expensiveItems) {
        OrderSummary summary = OrderProcessor.processCustomerOrder(items, taxRate);
        boolean isCorrect = false;
        if (isEqual(total, summary.getTotal())
            && isEqual(subtotal, summary.getSubtotal())
            && isEqual(tax, summary.getTax())
            && expensiveItems.length == summary.getExpensiveItems().length) {
            for (int i = 0; i < expensiveItems.length; i += 1) {
                if (!expensiveItems[i].equals(summary.getExpensiveItems()[i])) {
                    System.out.println("Test case failed :(");
                    return;
                }
            }
            System.out.println("passed");
        } else {
            System.out.println(isCorrect + ". did not pass");
        }
    }

    public static boolean isEqual(double one, double two) {
        double difference = Math.abs(one - two);
        return difference < 0.0001;
    }
}