

package com.mycompany.numberanalyzer;
import java.util.Scanner;
public class NumberAnalyzer {

    public static void main(String[] args) {
  Scanner input  = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;
        int countEven = 0;
        int countOdd = 0;

        System.out.print("How many numbers do you want to enter? ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("enter a number " + i + ": ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                sumEven += num;
                countEven++;
            } else {
                sumOdd += num;
                countOdd++;
            }
        }

        System.out.println("\n ---");
        System.out.println("sumeven= " + sumEven);
        System.out.println("==========================");
        System.out.println("sumodd= " + sumOdd);
        System.out.println("==========================");
        System.out.println("sumeven= " + countEven);
        System.out.println("==========================");
        System.out.println("countodd= " + countOdd);
        System.out.println("==========================");
        System.out.println("sumeven=" + (sumEven - sumOdd)); 
    }
}
