package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long numbers[] = new long[4];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = in.nextLong();
        }
        boolean flag = false;

        for (int i = 0; i < numbers.length - 1; i++)
        {
            if (flag)
            {
                break;
            }
            for (int j = i+1; j < numbers.length; j++)
            {
                if (numbers[i] + numbers[j] == 0)
                {
                    flag = true;
                    break;
                }
            }
        }

        if (flag)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
