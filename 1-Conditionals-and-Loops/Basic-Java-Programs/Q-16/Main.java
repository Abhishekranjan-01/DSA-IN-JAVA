//  Volume Of Cylinder

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radiius:\t");
        float radius = in.nextFloat();

        System.out.println("Enter Height:\t");
        float height = in.nextFloat();

        System.out.println("Volume Of Cylinder:\t"+Math.PI*Math.pow(radius, 2)*height);
    }
}
