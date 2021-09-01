package test_work;
import java.util.Scanner;
import samples.*;
import test_work.*;

public class Binary {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Conv.toBinary(x));
    }
}
