package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long number = 0;
        number = (1 << n);
        System.out.println(number);
    }
}
