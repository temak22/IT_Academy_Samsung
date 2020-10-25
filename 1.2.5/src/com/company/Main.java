package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = 0, m = 0, s = 0;
        h = n / 3600;
        h %= 24;
        n %= 3600;
        m = n / 60;
        s = n % 60;
        System.out.printf("%d:%02d:%02d", h, m, s);
    }
}
