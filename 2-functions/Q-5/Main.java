import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter two numbers:\t");
        Scanner sc= new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
      
        System.out.println(num1+"*"+num2+"="+product(num1, num2));
    }

    static int product(int num1,int num2){
        return num1*num2;
    }
}