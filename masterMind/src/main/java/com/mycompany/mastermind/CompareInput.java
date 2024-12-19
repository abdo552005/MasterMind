package com.mycompany.mastermind;

import java.util.Scanner;

public class CompareInput {

    Scanner input = new Scanner(System.in);
    GenerateRandom obj = new GenerateRandom();
    //Confirmations obj1 = new Confirmations();
    private char[] UserInput = new char[4];
    private int I = 0;
    private boolean confirm;
    private boolean isTrue = false;
    private char y;
    private int x = 0;
    private char[] userInput;
    private char[] comparing = obj.getRandom();

    public void setUserInput(char x, int y) {
        switch (x) {
            case 'r', 'R':
                UserInput[y] = 'R';
                I++;
                break;
            case 'g', 'G':
                UserInput[y] = 'G';
                I++;
                break;
            case 'b', 'B':
                UserInput[y] = 'B';
                I++;
                break;
            case 'y', 'Y':
                UserInput[y] = 'Y';
                I++;
                break;
            default:
                System.out.println("color not found");
        }
    }

    public char[] Input() {
        for (; I < 4;) {
            setUserInput(input.next().charAt(0), I);
        }
        I = 0;
        return UserInput;
    }

    public void compareColors() {
        for (int i = 0; i < 4; i++) {
            if (userInput[i] == comparing[i]) {
                x++;
            }
            if (x == 4) {
                isTrue = true;
                break;
            }

        }
    }

    public void compare(boolean ready) {
        confirm = ready;
        System.out.println("lets get started");
        System.out.println("Enter your color order");
        while (confirm) {
            userInput = Input();
            x = 0;
            compareColors();
            System.out.println(x + "correct");
            if (isTrue) {
                System.out.println("congratulations");
                break;
            }
            /*System.out.println("continue? y\\n");
            confirm = obj1.confirm();
             */
        }
    }
}
//01001814578
//01000665304 ramz al salaba 
