package com.example.srctest.binaryCalculator;

import java.util.Scanner;

public class binaryReader {
    public static void main(String[] args) {
        boolean validation = false;


        do {
            System.out.println("\nPlease enter the binary number you want to convert to decimals: ");
            binaryToDecimal(integerInput());
            System.out.println("\nPress 1 to enter another binary number or 0 to close program \n");
            if (integerInput() == 0) {
                validation = true;
            }
        } while (!validation);


    }
    public static void binaryToDecimal (int binaryNumber) {
        int decimalNumber = 0;
        int p = 0;
        while(true) {
            if (binaryNumber == 0) {
                break;
            } else {
                int temp = binaryNumber%10;
                decimalNumber += temp*Math.pow(2,p);
                binaryNumber = binaryNumber/10;
                p++;
            }
        }
        System.out.println(binaryNumber + " --> " + decimalNumber);
    }
    public static int integerInput(){
        int userInput;
        try {
            Scanner scanner = new Scanner(System.in);
            userInput =  Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ugyldigt input. Indtast venligst et nummer: ");
            return integerInput();
        }
        return userInput;
    }
}
