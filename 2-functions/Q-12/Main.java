import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter two numbers for getting prime numbers between them:\t");
        Scanner sc= new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        while (num1<=num2) {
            if(isPrime(num1)) 
                System.out.println(num1);
        
            num1++;
        }               
    }

    static boolean isPrime(int num){
        if(num <= 2) {
            return false;
        }
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
           
        }
         return true;
    }
}