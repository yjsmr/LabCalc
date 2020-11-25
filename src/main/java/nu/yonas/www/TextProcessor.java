package nu.yonas.www;

import java.util.Scanner;

public class TextProcessor {

    public static String upperCase(String userInput) {
        return userInput.toUpperCase();
    }

    public static String lowerCase(String userInput) {
        return userInput.toLowerCase();
    }

    public static String reverseText(String userInput) {
        StringBuilder input = new StringBuilder(userInput);
        StringBuilder reverseInput = input.reverse();
        String result = reverseInput.toString();
        return result;
    }

    public static void main(String[] args) {
        boolean executing = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Write something: ");

        String userInput = scan.nextLine();

        System.out.println(
                "| 1 - Change to uppercase " + " 2 - Change to lowercase " + "| 3 - Reverse text " + "| 0 - Quit");
        int usersChoice = scan.nextInt();
        scan.nextLine();

         while (executing) {
            switch (usersChoice) {
                case 0:
                    executing = false;
                    break;
                case 1:
                    System.out.println(upperCase(userInput));
                    break;
                case 2:
                    System.out.println(lowerCase(userInput));
                    break;
                case 3:
                    System.out.println(reverseText(userInput));
                    break;
                default:
                    System.out.println("Something went wrong");
                    break;
            }


    }

    }
}

