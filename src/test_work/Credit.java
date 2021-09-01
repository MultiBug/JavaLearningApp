package test_work;

import java.util.Scanner;

public class Credit
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int a1 = amount - amount / 10;
        int a2 = a1 - a1 / 10;
        int a3 = a2 - a2 / 10;
        System.out.println(a3);
    }
}