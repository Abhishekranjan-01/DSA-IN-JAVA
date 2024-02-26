// Addition Of Two Numbers

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number-1:\t");
        int num1 = sc.nextInt();
        System.out.println("Enter Number-2:\t");
        int num2 = sc.nextInt();

        System.out.println("Sum:\t"+(num1+num2));
    }
}
