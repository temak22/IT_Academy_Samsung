package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        if (((x >= -3) && (x <= 5)) || ((x >= 9) && (x <= 15)))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
