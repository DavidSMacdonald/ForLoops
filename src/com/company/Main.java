package com.company;

public class Main {

    public int addEvens(int n) {
        // science was eventful
        int sum = 0;
        for (int i = 2; i <= n; sum += i, i += 2) {        }
        return sum;
    }

    public void printSquaresBack(int n) {
        for (int i = n; i > 0; i--) {
            int sq = i * i;
            if (i > 1) {
                System.out.print(sq + ", ");
            } else System.out.println(sq);
        }
    }

    public void sillyNumbers() {
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k <3 ; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public void sillyNumbers2() {
        for (int i = 0; i <4 ; i++) {
            for (int j = 9; j >= 0; j--) {
                for (int k = 0; k <j ; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }

    public void dollarsAndStars() {
        for (int i = 7; i > 0; i--) {
            for(int j = 0; j < 2 * (7 - i); j++) {
                System.out.print("*");
            }
            // left dollar
            for(int j = 0; j < i; j++) {
                System.out.print("$");
            }
            // middle
            for(int j = 0; j < 2 * i; j++) {
                System.out.print("*");
            }
            // right dollar
            for(int j = 0; j < i; j++) {
                System.out.print("$");
            }
            for(int j = 0; j < 2 * (7 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.addEvens(4));
        System.out.println(m.addEvens(5));
        System.out.println(m.addEvens(8));
        System.out.println();
        m.printSquaresBack(8);
        System.out.println();
        m.sillyNumbers();
        System.out.println();
        m.sillyNumbers2();
        System.out.println();
        m.dollarsAndStars();
    }
}

/* OUTPUT */
//        6
//        6
//        20
//
//        64, 49, 36, 25, 16, 9, 4, 1
//
//        000111222333444555666777888999
//        000111222333444555666777888999
//        000111222333444555666777888999
//
//        999999999888888887777777666666555554444333221
//        999999999888888887777777666666555554444333221
//        999999999888888887777777666666555554444333221
//        999999999888888887777777666666555554444333221
//
//        $$$$$$$**************$$$$$$$
//        **$$$$$$************$$$$$$**
//        ****$$$$$**********$$$$$****
//        ******$$$$********$$$$******
//        ********$$$******$$$********
//        **********$$****$$**********
//        ************$**$************