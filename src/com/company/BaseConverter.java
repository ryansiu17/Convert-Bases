package com.company;

import java.util.Scanner;

public class BaseConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Base Converter! Enter an integer in base 10 to begin.");
        int dec = scan.nextInt();
        System.out.print("Choose a base to convert to \n 1. Base 2 (Binary) \n 2. Hexadecimal \n 3. Base 26 (0 = A, 1 = B...\n");

        int choice = scan.nextInt();
        switch(choice){
            case 1: convertBinary(dec);
            break;

            case 2: convertHexadecimal(dec);
            break;

            case 3: convertBase26(dec);
            break;
        }
    }

    public static void convertBinary(int num){
        int i = 0;
        int numTemp = num;
        int binaryArray[] = new int[100];
        System.out.println("Converting " + num + " to binary...");
        while(num > 0){
            binaryArray[i] = num%2;
            i++;
            num = num/2;
        }
        System.out.println(numTemp + " in binary is: ");
        String binaryString = new String();
        for(int j = i-1;j >= 0;j--){
            binaryString += String.valueOf(binaryArray[j]);
        }
        System.out.println(binaryString);
    }
    public static void convertHexadecimal(int num){
        int numTemp = num;
        String hexString = "";
        String[] hex = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        while(num > 0){
            hexString = hex[num%16] + hexString;
            num = num/16;
        }

        System.out.println(numTemp + " in hexadecimal is: ");
        System.out.println(hexString);
    }
    public static void convertBase26(int num){
        int numTemp = num;
        String b26String = "";
        String[] b26 =
                {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        while(num > 0){
            b26String = b26[num%26] + b26String;
            num = num/26;
        }

        System.out.println(numTemp + " in base 26 is: ");
        System.out.println(b26String);
    }

}
