package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        int i = in.nextInt();
        A = A & -(1 << i);
        System.out.println(A);
    }
}
