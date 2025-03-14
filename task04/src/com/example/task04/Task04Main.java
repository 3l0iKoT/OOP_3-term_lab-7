package com.example.task04;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new InputStreamReader(System.in)).useLocale(Locale.US);
        double sum = 0.0d;

        while (scanner.hasNext()){
            if(scanner.hasNextDouble()){
                sum += scanner.nextDouble();
            }
            else {
                scanner.next();
            }
        }

        System.out.printf(Locale.US,"%6f", sum);
    }
}
