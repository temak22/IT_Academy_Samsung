package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        int i = in.nextInt();
        long number = (1 << i) - 1;
        A = A & number;
        System.out.println(A);
    }
}
