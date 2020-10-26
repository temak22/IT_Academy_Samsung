package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();

        if (((x*x + y*y <= 1) && (x >= 0)) || ((y <= 1) && (y >= 0) && (x >= 0) && (y >= x - 1)))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}