// Perimeter Of Parallelogram

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Base:\t");
        float base = in.nextFloat();
        System.out.println("Enter Side:\t");
        float side = in.nextFloat();

        System.out.println("Perimeter Of Parallelogram Is:\t"+2*(base+side));
    }
}
