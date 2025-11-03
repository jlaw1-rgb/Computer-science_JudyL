public class DoorTester {
    public static void main (String[] args){
        Door frontdoor = new Door();
        Door backdoor = new Door();
        frontdoor.numberOfLocks();
        frontdoor.canBeLocked();
        frontdoor.shape();

        if (frontdoor.equals(backdoor)){
            System.out.println("They are equal.");
        } else
            System.out.println("They are equal.");
        }
    }