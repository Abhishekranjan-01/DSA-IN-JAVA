import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number:\t");
        Scanner sc= new Scanner(System.in);

        int num = sc.nextInt();
        
        System.out.println("Sum:\t"+sumOfFirstNumbers(num));
                       
    }

    static int sumOfFirstNumbers(int num){
        return (num*(num+1))/2;
    }
}