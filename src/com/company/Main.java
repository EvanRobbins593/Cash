package com.company;

import java.util.Scanner;

public class Main {
    public static double coins;

    public static double getCoins(double change, double coin){

        coins = Math.floor(change / coin);
        return coins;
    }

    public static void main(String[] args) {
        double changeOwed = -1;

        double coinCount = 0;
        double change = 0;

        while (changeOwed <= 0) {
            System.out.print("Change owed: ");
            Scanner sc = new Scanner(System.in);
            try {
                change = Double.parseDouble(sc.next());
                break;
            } catch(NumberFormatException ignore){
                System.out.println("invalid");
            }
        }
        changeOwed = change * 100;

        if (changeOwed >= 25) {

            coins = getCoins(changeOwed, 25);

            coinCount += coins;

            changeOwed = changeOwed - (coins * 25);
        }

        if (changeOwed >= 10) {

            coins = getCoins(changeOwed, 10);

            coinCount += coins;

            changeOwed = changeOwed - (coins * 10);
        }

        if (changeOwed >= 5) {

            coins = getCoins(changeOwed, 5);

            coinCount += coins;

            changeOwed = changeOwed - (coins * 5);
        }

        if (changeOwed >= 1) {

            coins = getCoins(changeOwed, 1);

            coinCount += coins;

            changeOwed = changeOwed - (coins * 1);
        }

        System.out.println(coinCount);

    }
}
