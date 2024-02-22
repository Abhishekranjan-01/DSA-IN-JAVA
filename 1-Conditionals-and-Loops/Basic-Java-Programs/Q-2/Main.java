// Area Of Triangle

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Base:\t");
        float base = in.nextFloat();
    
        System.out.println("Enter Height:\t");
        float height = in.nextFloat();
        System.out.println("Area Of Triangle Is:\t"+(base*height)/2);
    }
}
