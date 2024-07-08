import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Enter three numbers:\t");
        Scanner sc= new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.print("Maximum:\t"+maximum(num1, num2, num3));
        System.out.print("Minimum:\t"+minimum(num1, num2, num3));
            
    }

    static int maximum(int num1,int num2,int num3){

        return num1 >= num2 && num1 >= num3 ? num1:num2 >= num1 && num2 >= num3 ? num2:num3;
    }
    
    static int minimum(int num1,int num2,int num3){

        return num1 <= num2 && num1 <= num3 ? num1:num2 <= num1 && num2 <= num3 ? num2:num3;
    }
}