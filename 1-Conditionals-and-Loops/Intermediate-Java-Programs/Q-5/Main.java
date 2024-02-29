// Calculate Distance Between Two Points

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program To Find Distance Between Two Points In 2D Plane:\b");
        System.out.println("Enter x1 Of The Coordinate:\t");
        float x1 = sc.nextFloat();

        System.out.println("Enter y1 Of The Coordinate:\t");
        float y1 = sc.nextFloat();


        System.out.println("Enter x2 Of The Coordinate:\t");
        float x2 = sc.nextFloat();
        
        System.out.println("Enter y2 Of The Coordinate:\t");
        float y2 = sc.nextFloat();
  
     
        System.out.println("Distance Between Two Points Is:\t"+Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));

    }
}
