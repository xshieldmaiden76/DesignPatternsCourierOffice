import Factory.PackagingMachine;
import Packages.Package;
import Singleton.Office;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        boolean makeMorePackages = true;
        Scanner scannerInput = new Scanner(System.in);
        String userChoice;


        while (makeMorePackages) {

            System.out.println("Would you like to make a package?");
            System.out.println("Please type 'yes' or 'no'");

            userChoice = scannerInput.next();

            if (userChoice.equalsIgnoreCase("yes")) {

                System.out.println("");

            }

            else if (userChoice.equalsIgnoreCase("no")) {

                System.out.println("");
                System.out.println("You refused to make a package.");
                System.out.println("Bye bye!");
                System.out.println("");
                makeMorePackages = false;

            }

            else {

                System.out.println("");
                System.out.println("Please provide a valid answer, meaning yes or no.");
                System.out.println("");


            }
        }
    }
}