
import java.util.Scanner;

public class ProjectTester {

    public static void main(String[] args) {
        System.out.println("\nWelcome to melody generator! How many melodies would you like today?");
        Scanner scan1 = new Scanner(System.in);
        int num = Integer.parseInt(scan1.nextLine());
        MelodyGenerator x = new MelodyGenerator(num);
        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                System.out.println("Give your first melody a title: ");
            } else if (i == 2) {
                System.out.println("Give your second melody a title: ");
            } else if (i == 3) {
                System.out.println("Give your third melody a title: ");
            } else {
                System.out.println("Give your " + i + "th melody a title: ");
            }
            Scanner scan2 = new Scanner(System.in);
            String s = scan2.nextLine();
            x.addMelody(s);
        }
        System.out.println("Great! Here are your melodies:" + x.toString());

        System.out.println("\nAnd in alphabetical order:\n");
        x.alphabeticalSort();
        System.out.println(x.toString());
    }
}
