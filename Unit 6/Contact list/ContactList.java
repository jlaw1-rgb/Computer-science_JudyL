
import java.util.AbstractList;
import java.util.ArrayList;

public class ContactList extends AbstractList {

    // instance variable
    private ArrayList<String> contactList;

    // constructor
    // to-do: initializes an empty contact list
    public ContactList() {
        ArrayList<String> list = new ArrayList<>();
        this.contactList = list;
    }

    // methods
    // to-do: findInsertLocation(String name)
    /**
     * returns the location in the contact list where the name should go to keep
     * the list alphabetized
     */
    public int findInsertLocation(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null. ");
        }
        int t = contactList.size();
        for (int i = 0; i < contactList.size(); i++) {
            if (name.toLowerCase().compareTo(contactList.get(i).toLowerCase()) < 0) {
                t = i;
                return t;
            }

        }
        return t;
    }

    // to-do: add(String name)
    /**
     * adds a name to the contact list so that the list remains alphabetized, it
     * prints out which name is being added, also the method prevents duplicate
     * names from being added
     */
    public boolean add(String name) {
        int location = findInsertLocation(name);
        if (exists(name) == true) {
            System.out.println(name + " already exists. They cannot be added again.");
            return false;
        } else {
            System.out.println("+ Adding " + name);
            contactList.add(location, name);
            return true;
        }
    }

    // to-do: add(ArrayList<String> names)
    // this method adds a list of names to the contact list */
    public void add(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            add(names.get(i));
        }
    }

    // to-do: remove(String name)
    // removes name from the contact list and keeps list alphabetized
    public boolean remove(String name) {
        if (exists(name) == false) {
            System.out.println(name + " does not exist. They cannot be removed.");
            return false;
        } else {
            System.out.println("- Removing " + name);
            contactList.remove(name);
            return true;
        }

    }

    // to-do: remove(ArrayList<String> names)
    // this method removes a list of names from the contact list */
    public void remove(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            remove(names.get(i));
        }
    }

    /**
     * returns a String containing all of the words in list
     */
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    // to-do: get(int index)
    // returns the name at the specified index
    public String get(int index) {
        return contactList.get(index);
    }

    // to-do: size()
    // returns the number of names in the contact list
    public int size() {
        return contactList.size();
    }

    // to-do: clear() 
    // removes all names from the contact list
    @Override
    public void clear() {
        System.out.println("Clearing the contact list");
        contactList.clear();
    }

    public boolean exists(String name) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).equals(name)) {
                return true;
            }
        }
        return false;
    }
}
