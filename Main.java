package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        int a = 3;

        Scanner scan = new Scanner(System.in);
        String answer = null;

        System.out.println("for test run..?  Y/N: ");

        ans = scan.nextLine();

        System.out.println(ans);

        if (ans.equals("Y")) {
            for (int i = 1; i < 10; i++) {
                int sum = a + i;
                System.out.println(sum + " <<for grammer test");
            }
        }else{
                System.out.println("program exited.");

                scan.close();

            }

    }}