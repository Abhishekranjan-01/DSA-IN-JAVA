// Perimeter Of Circle

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Radius:\t");
        Scanner in = new Scanner(System.in);

        float radius = in.nextFloat();

        System.out.println("Perimeter Of Circle:\t"+2*Math.PI*radius);
    }
}