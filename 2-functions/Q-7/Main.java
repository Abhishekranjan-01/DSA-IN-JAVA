import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter two numbers:\t");
        Scanner sc= new Scanner(System.in);

        int num = sc.nextInt();
        
        if(isPrime(num)){
            System.out.println(num+":\tIs Prime");
        }else{
            System.out.println("Not Prime");
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