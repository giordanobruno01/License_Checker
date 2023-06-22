import java.util.Scanner;

public class ItemCheckerApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // variables
        String userChoice = "";
        String userText;
        // creating the object
        ItemChecker ic = new ItemChecker();

        // loop to keep the program running till the user stop it
        do {
            System.out.println("Please provide a registration plate in this format: YYY-LL-SSSSSS");
            userText = input.nextLine();

            ic.setUserText(userText);// sending data to the setter

            if (ic.compute()) {// computing the validity of the input
                System.out.println("Valid Input and the registration plate is: " + ic.getUserText());
            }
            System.out.println("press 'yes' to continue: ");
            userChoice = input.nextLine(); // asking if the user wants to continue
        } while (userChoice.equalsIgnoreCase("YES"));

        // prompt the user to provide the number of items they would like to be created
        System.out.println("How many security codes you would like to create?");
        int userAmount = input.nextInt();
        String codes[] = new String[userAmount];
        codes = ic.securityCode(userAmount);// sending the number of the security codes to generate and save in the
                                            // array

        // printing security codes in the array
        System.out.println("The codes created are: ");
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);
        }
    }
}
