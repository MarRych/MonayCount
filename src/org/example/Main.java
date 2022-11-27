package org.example;

import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter number: ");
                String input = scanner.next();


                while (input.length() != 15) //input.length()<15 || input.length()>15
                // zabezpieczenie przed zerem podobna zasada
                {
                    System.out.println("Invalid number. Try again:");
                    input = scanner.next();
                }

                double result = 0;
                double[] monay = {0.01,0.02,0.05,0.1,0.2,0.5,1,2,5,10,20,50,100,200,500};
                for(int i=0; i<input.length();i++ ){
                    char markNumber = input.charAt(i);
                    int amountOfMonay = Character.getNumericValue(markNumber);
                    result = amountOfMonay * monay[i];

                }
                System.out.printf("%.2f%n",result);



            }
        }
