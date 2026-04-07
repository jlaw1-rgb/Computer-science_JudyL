
public class ContactListTester {

    public static void main(String[] args) {
        Contact first = new Contact("Alice", "A", "123-456-7890");
        Contact second = new Contact("Judy", "L", "000-000-0000");
        Contact third = new Contact("Zack", "Zebra", "999-999-9999");
        Contact fourth = new Contact("Bob", "B", "223-456-7890");
        Contact fifth = new Contact("C", "C", "323-456-7890");

        ContactList list = new ContactList();
        list.add(first);
        list.add(second);
        list.add(fifth);
        list.add(third);
        list.add(fourth);
        list.sortByLastName();
        System.out.println(list);
    }
}
