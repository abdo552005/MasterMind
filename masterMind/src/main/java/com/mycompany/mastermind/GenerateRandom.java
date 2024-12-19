package com.mycompany.mastermind;

public class GenerateRandom {

    private char[] Random = new char[4];
    private String from = "RGBY";

    public char[] getRandom() {
        return Random;
    }

    private int[] generateRandomNums() {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 4);
            switch (i) {
                case 1:
                    if (arr[i] == arr[i - 1]) {
                        i--;
                    }
                    break;
                case 2:
                    if (arr[i] == arr[i - 1] || arr[i] == arr[i - 2]) {
                        i--;
                    }
                    break;
                case 3:
                    if (arr[i] == arr[i - 1] || arr[i] == arr[i - 2] || arr[i] == arr[i - 3]) {
                        i--;
                    }
                    break;
                /*case 4:
                    if (arr[i] == arr[i - 1] || arr[i] == arr[i - 2] || arr[i] == arr[i - 3] || arr[i] == arr[i - 4]) {
                        i--;
                    }
                    ;
                    break;*/
                default:
                    break;
            }
        }
        return arr;
    }

    public GenerateRandom() {
        int[] arr = generateRandomNums();
        String randomColor = from;
        for (int i = 0; i < 4; i++) {
            Random[i] = randomColor.charAt(arr[i]);
        }
    }
}
