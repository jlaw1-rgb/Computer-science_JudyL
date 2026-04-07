
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

public class ContactList extends AbstractList<Object> {

    private ArrayList<Contact> contactList;

    public ContactList() {
        this.contactList = new ArrayList<>();
    }

    public boolean add(Contact contact) {
        if (searchContacts(contact.getTelephoneNumber()) == null) {
            contactList.add(contact);
            return true;
        }
        System.out.println("Contact with the same phone number already exists. Adding failed. ");
        return false;
    }

    public boolean remove(Contact contact) {
        if (searchContacts(contact.getTelephoneNumber()) != null) {
            contactList.remove(contact);
            return true;
        }
        System.out.println("Contact does not exist. Removing failed. ");
        return false;
    }

    public void sortByFirstName() {
        Collections.sort(contactList);
    }

    public void sortByLastName() {
        for (int i = 1; i < contactList.size(); i++) {
            insert(contactList.get(i), i);
        }
    }

    public void sortByTelephoneNumber() {
        for (int i = 0; i < contactList.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < contactList.size(); j++) {
                if (contactList.get(j).getTelephoneNumber().compareTo(contactList.get(min).getTelephoneNumber()) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                swap(min, i);
            }
        }
    }

    public Contact searchContacts(String telephoneNumber) {
        for (int i = 0; i < contactList.size(); i++) {
            if ((contactList.get(i)).getTelephoneNumber().equals(telephoneNumber)) {
                return contactList.get(i);
            }
        }
        return null;
    }

    //helper
    //methods
    public void insert(Contact contact, int index) {
        for (int i = index - 1; i >= 0; i--) {
            if (contact.getLastName().compareTo(contactList.get(i).getLastName()) < 0) {
                swap(i, i + 1);
            } else if (contact.getLastName().compareTo(contactList.get(i).getLastName()) == 0) {
                if (contact.getFirstName().compareTo(contactList.get(i).getFirstName()) < 0) {
                    swap(i, i + 1);
                } else if (contact.getFirstName().compareTo(contactList.get(i).getFirstName()) == 0) {
                    if (contact.getTelephoneNumber().compareTo(contactList.get(i).getTelephoneNumber()) < 0) {
                        swap(i, i + 1);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void swap(int first, int second) {
        Contact temp = contactList.get(second);
        contactList.set(second, contactList.get(first));
        contactList.set(first, temp);
    }

    public Contact get(int index) {
        return contactList.get(index);
    }

    @Override
    public int size() {
        return contactList.size();
    }

    public String toString() {
        String to = "";
        for (int i = 0; i < contactList.size(); i++) {
            to = to + contactList.get(i).tosString() + "\n";
        }
        return to;
    }
}
