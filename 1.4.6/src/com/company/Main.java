package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        boolean flag = false;
        for(int i = 0; i < 30; i++)
        {
            if (n == (1 << i))
            {
                flag = true;
                break;
            }
        }
        if (flag)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}