package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0;
        for (int i = 0; i < 3; i++)
        {
            sum += number % 10;
            number /= 10;
        }
        System.out.print(sum);
    }
}
