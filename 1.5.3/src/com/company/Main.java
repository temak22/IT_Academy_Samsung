package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        if (((x >= -2) && (x <= 3)) || ((x >= 6) && (x <= 9)))
        {
            System.out.println("false");
        }
        else
        {
            System.out.println("true");
        }
    }
}
