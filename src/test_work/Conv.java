package test_work;
import test_work.*;

public class Conv {
    public static String toBinary(int num) {
        String binary = "";
        while(num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }
}