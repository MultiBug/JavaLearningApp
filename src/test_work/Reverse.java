package test_work;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        String rev = "";
        for (char i : arr)
            rev = i + rev;
        System.out.println(rev);
    }
}