package com.mycompany.mastermind;

import java.util.Scanner;

public class MasterMind {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Confirmations confirm = new Confirmations();
        CompareInput obj = new CompareInput();
        GenerateRandom o = new GenerateRandom();

        boolean ready = confirm.ready();
        if (ready) {
            obj.compare(ready);
        } else {
            System.out.println("Thanks for playing");
        }
    }
}
