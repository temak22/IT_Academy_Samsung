package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        if ((x / 100 >= 1) && (x / 1000 < 1) && (x > 0) && (x % 5 == 0))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}

