package com.codegym.task.task18.task1807;

/* 
Counting commas

ACII code for ',' is 44

*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        sc.close();


        FileInputStream inputStream = new FileInputStream(fileName);
        int count = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data == 44) {
                count++;
            }
        }
        inputStream.close();
        System.out.println(count);
    }
}
