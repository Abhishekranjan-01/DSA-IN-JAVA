import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number:\t");
        Scanner sc= new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(factorial(num));
                
    }

    static int factorial(int num){
        int fact = 1;
        if (num == 1 || num == 0) {
            return 1;
        }
        while (num > 1) {
            fact *= num;
            num--;
        }

       return fact;       
    }
}