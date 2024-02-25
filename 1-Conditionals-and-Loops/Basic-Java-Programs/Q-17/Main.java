// Volume Of Sphere
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    System.out.println("Enter Radius:\t");
    float radius = in.nextFloat();

    System.out.println("Area Of Radius:\t"+(4*Math.PI*Math.pow(radius, 3))/3);
}
    
}