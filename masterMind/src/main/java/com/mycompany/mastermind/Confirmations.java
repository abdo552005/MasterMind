package com.mycompany.mastermind;

import java.util.Scanner;

public class Confirmations {

    Scanner input = new Scanner(System.in);

    public boolean confirm() {
        char condition;
        boolean x = false;
        boolean y = true;
        while (y) {
            condition = input.next().charAt(0);
            switch (condition) {
                case 'y', 'Y':
                    x = true;
                    y = false;
                    break;
                case 'n', 'N':
                    x = false;
                    y = false;
                    break;
                default:
                    System.out.println("invalid statment");
            }
        }
        return x;
    }

    public boolean ready() {
        char x;
        System.out.println("There is some rules :");
        System.out.println("1) The colors is (Red, Green, Blue, Yellow)");
        System.out.println("2) You can't input external color ");
        //System.out.println("3) ");
        System.out.println("Are you ready to play our game \"Master Mind?\"");
        System.out.println("Y\\N");
        return confirm();
    }
}
