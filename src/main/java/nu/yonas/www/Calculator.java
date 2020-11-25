package nu.yonas.www;

import java.util.*;

public class Calculator {

    public static int addition(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int subtraction(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public static int multiplication(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public static int division(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean executing = true;
        int numberOne, numberTwo;

        System.out.println("Write a number");
        numberOne = scan.nextInt();
        System.out.println("Write another number");
        numberTwo = scan.nextInt();
        System.out.println(
                "1 Addition |" + "2 Subtraction |" + "3 Multiplication |" + "4 Division |" + "0: Quit |");

        while (executing) {
            int userInput = scan.nextInt();
            scan.nextLine();
            switch (userInput) {
                case 1:
                    System.out.println(addition(numberOne, numberTwo));
                    break;
                case 2:
                    System.out.println(subtraction(numberOne, numberTwo));
                    break;
                case 3:
                    System.out.println(multiplication(numberOne, numberTwo));
                    break;
                case 4:
                    System.out.println(division(numberOne, numberTwo));
                    break;
                case 0:
                    executing = false;
                    break;
            }


        }
    }
}

