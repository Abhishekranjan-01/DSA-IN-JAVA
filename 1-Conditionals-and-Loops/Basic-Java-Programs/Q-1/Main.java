// Area Of Circle Java Program

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle:\t");
        float radius = in.nextFloat();

        System.out.println("Area Of Circle: "+(Math.PI*Math.pow(radius, 2)));
    }
}