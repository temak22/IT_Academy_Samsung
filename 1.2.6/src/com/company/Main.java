package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int rez = a*a + b*b;
        System.out.println(rez);
    }
}
