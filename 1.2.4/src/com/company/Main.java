package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        a *= n;
        b *= n;
        if (b > 99)
        {
            a += (b / 100);
            b %= 100;
        }
        System.out.println(a + " " + b);
    }
}
