// Total Surface Area Of Cube

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Side:\t");
        float side = in.nextFloat();

        System.out.println("Total Surface Area Of Cube:\t"+6*Math.pow(side, 2));
    }
}
