// Area Of Equilateral Triangle

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Side: ");
        Scanner in = new Scanner(System.in);

        float side = in.nextFloat(); 
        System.out.println("Area Of Equilateral Triangle:\t"+(Math.sqrt(3)*Math.pow(side, 2))/4);


    }
}
