package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i >= 0 && i < 10){
            System.out.println("single");
        }
        else if (i >=10 && i < 100){
            System.out.println("dozens");
        }
        else if (i >=1000 && i < 10000){
            System.out.println("thousands");
        }
        else if (i > 10000 && i < 100000){
            System.out.println("tens of thousands");
        }
        else{
            System.out.println("wrong number");
        }
    }
}
