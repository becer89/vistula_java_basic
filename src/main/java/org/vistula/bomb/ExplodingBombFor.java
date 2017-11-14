package org.vistula.bomb;

import java.util.Scanner;

public class ExplodingBombFor {

    public static void main(String[] args) {
        int count, i;
        System.out.println("When the bomb will explode?:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.print("Bomb will explode in:");


        for (i=count; i>= 0; i--){
            System.out.print(i+ " ");

    }
}}
