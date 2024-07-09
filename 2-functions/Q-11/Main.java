import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter three number:\t");
        Scanner sc= new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println( isPythagoreanTriplet(num1,num2,num3));
                
    }

    static boolean  isPythagoreanTriplet(int num1,int num2,int num3){

        return Math.pow(num1, 2) + Math.pow(num2,2) == Math.pow(num3,2);
    }
}