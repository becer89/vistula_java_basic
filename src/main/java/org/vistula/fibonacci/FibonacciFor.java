package org.vistula.fibonacci;

import java.util.Scanner;

public class FibonacciFor {


    public static void main(String[] args) {

        int count, num1 = 0, num2 = 1;
        System.out.println("How may numbers you want in the sequence:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci Series of " + count + " numbers:");


        int i;
        for (i=1; i<= count; i++){
            System.out.print(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }




    }

}