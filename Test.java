import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        //Enter your own code to take user input in string format
        String userString;
        Scanner scObj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        userString = scObj.nextLine();

        // Call the function and change the parameters accordingly
        CheckVal(userString, userString + " is an integer!", userString + " is not an integer!", userString + " is an integer but with a greater length!");
    }

    static void CheckVal(String userString, String messageIfCorrect, String messageIfNotNumber, String messageIfNumberExceedsLength) {

        try {
            Integer.valueOf(userString);
            System.out.println(messageIfCorrect);
        } catch (NumberFormatException e) {

            int containChar = 0;
            for (int i = 0; i <= userString.length() - 1; i++) {
                if (Character.isDigit(userString.charAt(i)) == false) {
                    containChar = 1;
                    break;
                }
            }
            if (containChar == 1) {
                System.out.println(messageIfNotNumber);
                //CheckVal();
            } else {
                System.out.println(messageIfNumberExceedsLength);
                //CheckVal();
            }

        }
    }

}
