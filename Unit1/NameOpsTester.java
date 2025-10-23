public class NameOpsTester {
    public static void main(String[] args) {
        String name1 = "Cher"; // one name
        String name2 = "Elton John"; // two names
        String name3 = "Elvis Aaron Presley"; // three names

        // // testing whoIsAwesome()
        // System.out.println("\n\n\n== Testing whoIsAwesome() ==\n");
        // String method = "whoIsAwesome";
        // String test1 = NameOps.printMethodCall(method, name1) + NameOps.whoIsAwesome(name1); 
        // String test2 = NameOps.printMethodCall(method, name2) + NameOps.whoIsAwesome(name2);
        // String test3 = NameOps.printMethodCall(method, name3) + NameOps.whoIsAwesome(name3);
        // System.out.println(test1); // Cher is awesome!
        // System.out.println(test2); // Elton John is awesome!
        // System.out.println(test3); // Elvis Aaron Presley is awesome!
        // System.out.println();

        // // testing indexOfFirstSpace()
        // System.out.println("\n\n\n== Testing indexOfFirstSpace() ==\n");
        // String method = "indexOfFirstSpace";
        // String test1 = NameOps.printMethodCall(method, name1) + NameOps.indexOfFirstSpace(name1);
        // String test2 = NameOps.printMethodCall(method, name2) + NameOps.indexOfFirstSpace(name2);
        // String test3 = NameOps.printMethodCall(method, name3) + NameOps.indexOfFirstSpace(name3);
        // System.out.println(test1); // -1
        // System.out.println(test2); // 5
        // System.out.println(test3); // 5
        // System.out.println();

        // // testing indexOfSecondSpace()
        // System.out.println("\n\n\n== Testing indexOfSecondSpace() ==\n);
        // String method = "indexOfSecondSpace";
        // String test1 = NameOps.printMethodCall(method, name1) + NameOps.indexOfSecondSpace(name1);
        // String test2 = NameOps.printMethodCall(method, name2) + NameOps.indexOfSecondSpace(name2);
        // Stringtest3 = NameOps.printMethodCall(method, name3) + NameOps.indexOfSecondSpace(name3);
        // System.out.println(test1); // -1
        // System.out.println(test2); // -1
        // System.out.println(test3); // 11
        // System.out.println();

        // // testing findFirstName()
        // System.out.println("\n\n\n== Testing findFirstName() ==\n");
        // String method = "findFirstName";
        // String test1 = NameOps.printMethodCall(method, name1) + NameOps.findFirstName(name1);
        // String test2 = NameOps.printMethodCall(method, name2) + NameOps.findFirstName(name2);
        // String test3 = NameOps.printMethodCall(method, name3) + NameOps.findFirstName(name3);
        // System.out.println(test1); // Cher
        // System.out.println(test2); // Elton
        // System.out.println(test3); // Elvis
        // System.out.println();

        // // testing findLastName()
        // System.out.println("\n\n\n== Testing findLastName() ==\n");
        // String method = "findLastName";
        // String test1 = NameOps.printMethodCall(method, name1) + NameOps.findLastName(name1);
        // String test2 = NameOps.printMethodCall(method, name2) + NameOps.findLastName(name2);
        // String test3 = NameOps.printMethodCall(method, name3) + NameOps.findLastName(name3);
        // System.out.println(test1); // 
        // System.out.println(test2); // John
        // System.out.println(test3); // Presley
        // System.out.println();

        // // testing findMiddleName()
        // System.out.println("\n\n\n== Testing findMiddleName() ==\n");
        // String method = "findMiddleName";
        // String test1 = NameOps.printMethodCall(method, name1) + NameOps.findMiddleName(name1);
        // String test2 = NameOps.printMethodCall(method, name2) + NameOps.findMiddleName(name2);
        // String test3 = NameOps.printMethodCall(method, name3) + NameOps.findMiddleName(name3);
        // System.out.println(test1); //
        // System.out.println(test2); //
        // System.out.println(test3); // Aaron
        // System.out.println();

        // testing generateLastFirstMidInitial()
        System.out.println("\n\n\n== Testing generateLastFirstMidInitial() ==\n");
        String method = "generateLastFirstMidInitial";
        String test1 = NameOps.printMethodCall(method, name1) + NameOps.generateLastFirstMidInitial(name1);
        String test2 = NameOps.printMethodCall(method, name2) + NameOps.generateLastFirstMidInitial(name2);
        String test3 = NameOps.printMethodCall(method, name3) + NameOps.generateLastFirstMidInitial(name3);
        System.out.println(test1); // Cher
        System.out.println(test2); // John, Elton
        System.out.println(test3); // Presley, Elvis A.
        System.out.println();
    }

}
