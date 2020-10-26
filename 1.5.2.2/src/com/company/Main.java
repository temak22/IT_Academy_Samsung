package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();

        if ((y >= 0) && (y <= 0.5) && (x >= 0) && (x <= Math.PI) && (y <= Math.sin(x)))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
