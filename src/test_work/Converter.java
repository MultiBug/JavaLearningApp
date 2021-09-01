package test_work;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int hours = days * 24;
        int min = hours * 60;
        int sec = min * 60;
        System.out.println(sec);
    }
}