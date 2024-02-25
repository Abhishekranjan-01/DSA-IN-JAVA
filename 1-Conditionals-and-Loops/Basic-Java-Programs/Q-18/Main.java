// Volume Of Pyramid

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Base Widht:\t");
    float baseWidth = in.nextFloat();

    System.out.println("Enter Base Lenght:\t");
    float baseLength = in.nextFloat();

    System.out.println("Enter Pyramid Height:\t");
    float pyramidHeight = in.nextFloat();

    System.out.println("Volume Of Pyramid:\t"+(baseWidth*baseLength*pyramidHeight)/3);
}
    
}