import java.util.Scanner;

public class incrementingaNumber {

        public static void main(String[] args) {
            int value = 1;

            System.out.println("Before incrementing: " + value);

            increment(value);

            System.out.println("After incrementing: " + value);
        }

        public static void increment(int value) {
            value = value + 1;
            System.out.println("Incremented value : " + value);

        }
    }
