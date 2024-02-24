// Volume Of Rectangular Prism

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Base Width:\t");
        float width = in.nextFloat();
        
        System.out.println("Enter Base Length:\t");
        float length = in.nextFloat();

        System.out.println("Enter Height:\t");
        float height = in.nextFloat();

        System.out.println("Volume Of Rectangular Prism:\t"+length*width*height);
    }
}
