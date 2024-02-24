// Volume Of Cone Java Program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Radius:\t");
        float radius = in.nextFloat();

        System.out.println("Enter Height:\t");
        float height = in.nextFloat();

        System.out.println("Volume Of Cone:\t"+Math.PI*Math.pow(radius,2)*(height/3));

    }
}
