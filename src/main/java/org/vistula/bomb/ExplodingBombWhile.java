package org.vistula.bomb;

import java.util.Scanner;

public class ExplodingBombWhile {


    public static void main(String[] args) {
        int count;
        System.out.println("When the bomb will explode?:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.print("Bomb will explode in:");

        int i=0;
        while (i<=count) {
           System.out.print(count + " ");
           count--;
       }


}}
