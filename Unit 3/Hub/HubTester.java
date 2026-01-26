
public class HubTester {

    public static void main(String[] args) {

        try {
            Assignment a = new Assignment(null, "Valid description");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Null title exception triggered intentionally\n");
        }

        try {
            new Assignment("", "Valid description");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Blank title exception triggered intentionally\n");
        }

        try {
            new Assignment("Valid Title", null);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Null description exception triggered intentionally\n");
        }

        try {
            new Assignment("Valid Title", "   ");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Blank description exception triggered intentionally\n");
        }

        System.out.println("\nTESTING hub1");

        Hub hub1 = new Hub();

        try {
            hub1.registerStudent("", "pass", "test@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Blank name exception triggered intentionally\n");
        }

        try {
            hub1.registerStudent("Bob@", "pass", "test@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("'@' in name exception triggered intentionally\n");
        }

        try {
            hub1.registerStudent("Bob", "pass", "badEmail");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Invalid email exception triggered intentionally\n");
        }

        hub1.registerStudent("Alice", "password", "alice@email.com");

        try {
            hub1.registerStudent("Alice", "password", "alice@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Duplicate student exception triggered intentionally\n");
        }

        try {
            hub1.loginStudent("NotAUser", "password");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Login non-existent user exception triggered intentionally\n");
        }

        try {
            hub1.loginStudent("Alice", "wrongpass");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Wrong password exception triggered intentionally\n");
        }

        System.out.println("=== STUDENT EXCEPTION TESTS ===");

        Student s = new Student("Charlie", "secret", "charlie@email.com");

        try {
            s.changeName("Alice");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Change name to existing name exception triggered intentionally\n");
        }

        try {
            s.submitAssignment("", "Desc");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Blank assignment title exception triggered intentionally\n");
        }

        try {
            s.submitAssignment("Title", "");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Blank assignment description exception triggered intentionally\n");
        }

        try {
            for (int i = 0; i < 10; i++) {
                s.submitAssignment("Title " + i, "Description");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Assignment limit exception triggered intentionally\n");
        }

        System.out.println("=== ALL EXCEPTIONS TESTED SUCCESSFULLY ===");
    }
}
