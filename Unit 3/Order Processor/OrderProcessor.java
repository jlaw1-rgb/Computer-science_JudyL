public class OrderProcessor {
    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        double subtotal = calculateSubtotal(items);
        // Trim premium items to exact size
        String [] expensiveItems = getExpensiveItems(items);

        // Calculate tax and total
        double tax;
        double total;
        if (isSubtotalValid(subtotal)) {
            tax = subtotal * taxRate;
            total = subtotal + tax;
        } else {
            tax = 0;
            total = 0;
        }

        printOrder(subtotal, tax, total, expensiveItems.length);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }


    public static double calculateItemTotal(double price, int quantity) {
        return price * quantity;
    }

    public static boolean isExpensive(double price) {
        return price > 50.0;
    }

    public static String[] trimStringArray(String[] temp, int count) {
        String[] expensiveItems = new String[count];
        for (int i = 0; i < count; i++) {
            expensiveItems[i] = temp[i];
        }
        return expensiveItems;
    }

    public static boolean isSubtotalValid(double subtotal) {
        return (subtotal > 0);
    }

    public static double calculateSubtotal(Item[] items) {
        // for (int i = 0; i < items.length; i++) {
        //     Item item = items[i];
        // }
        double subtotal = 0;
        for (Item item : items) {
            double price = item.getPrice();
            int quantity = item.getQuantity();

            // Calculate item total
            subtotal = subtotal + calculateItemTotal(price, quantity);
        }
        return subtotal;
    }

    public static String[] getExpensiveItems(Item[] items) {
        // Check if expensive
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;
        for (Item item : items) {
            if (isExpensive(item.getPrice())) {
                expensiveItemsTemp[premiumCount] = item.getName();
                premiumCount += 1;
                System.out.println(item.getName() + " is a premium item at $" + item.getPrice());
            } else {
                System.out.println(item.getName() + " is a regular item at $" + item.getPrice());
            }
        }
        return trimStringArray(expensiveItemsTemp, premiumCount);
    }

    public static void printOrder(double subtotal, double tax, double total, int count) {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + count);

    }
}

/* 
First I realized that the method is doing 1) calculate subtotal,
2) count expensive items, 3) calculate tax and total, 4) print order summary

So I put them each into their own methods and also
added useful methods along the way.

*/