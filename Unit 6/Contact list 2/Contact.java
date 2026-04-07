
public class Contact implements Comparable<Object> {

    String firstName;
    String lastName;
    String telephoneNumber;

    public Contact(String firstName, String lastName, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        String temp = "XXX" + telephoneNumber.charAt(3) + "XXX" + telephoneNumber.charAt(7) + "XXXX";
        if (!"XXX-XXX-XXXX".equals(temp)) {
            throw new IllegalArgumentException();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public int compareTo(Object other) {
        Contact myContact = (Contact) other;
        if (firstName.compareTo(myContact.getFirstName()) != 0) {
            return firstName.compareTo(myContact.getFirstName());
        } else {
            if (lastName.compareTo(myContact.getLastName()) != 0) {
                return lastName.compareTo(myContact.getLastName());
            } else {
                if (telephoneNumber.compareTo(myContact.getTelephoneNumber()) != 0) {
                    return lastName.compareTo(myContact.getLastName());
                } else {
                    return 0;
                }
            }
        }
    }

    public String tosString() {
        return firstName + " " + lastName + ": " + telephoneNumber;
    }

}
