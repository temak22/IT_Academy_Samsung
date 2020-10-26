package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();

        if (((y >= 1 - x) && (x <= 1) && (x >= 0)) || ((x <= 0) && (y >= 1 - x) && (y >= 2*x*x)))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}