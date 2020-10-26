package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long numbers[] = new long[3];
        int count = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = in.nextLong();
            if (numbers[i] % 2 == 0)
            {
                count++;
            }
        }

        if (count >= 2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
