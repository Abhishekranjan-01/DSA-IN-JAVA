import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Radius:\t");
        Scanner sc= new Scanner(System.in);

        int radius = sc.nextInt();
              
        System.out.println("Circumference Of Circle:\t"+"="+circumferenceOfCircle(radius));
        System.out.println("Area Of Circle:\t"+"="+areaOfCircle(radius));
    }

    static double circumferenceOfCircle(float radius){
        return 2 * (Math.PI) *radius;
    }
    static double areaOfCircle(float radius){
        
        return Math.PI*Math.pow(radius, 2);
    }
}