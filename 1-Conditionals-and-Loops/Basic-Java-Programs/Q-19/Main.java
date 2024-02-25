// Curved Surface Area Of Cylinder

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Radius:\t");
        float radius = in.nextFloat();

        System.out.println("Enter Height:\t");
        float height = in.nextFloat();

        System.out.println("Curved Surface Area Of Cylinder:\t"+2*Math.PI*radius*height);
    }
}
