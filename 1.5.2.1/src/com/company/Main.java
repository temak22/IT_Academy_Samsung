package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();

        if ((x <= 2) && (y <= x) && (x*x + y*y >= 4) && (x > 0) && (y > 0))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
