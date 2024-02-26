// Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        
        int add = 0,mul=1;
        int rem = 0;
        while(n!=0){
            rem = n%10;
            n = n/10;

            mul = mul * rem;
            add = add + rem;
    

    }
    
    System.out.println("The Difference Between Product & Sum Of The Integer Is:\t"+(mul-add));
}
};