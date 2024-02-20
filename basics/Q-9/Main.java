// To find Armstrong Number between two given number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter The Number To Get It's Armstrong: ");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int number = input;
        int rem=0;
        int count =0;
        while (number!=0) {
            rem = number%10;
            number = number/10;

            count++;
        }
        number = input;

        int result =0;int storeResult = 0;

        while (number!=0) {

            rem = number%10;
            number = number/10;

            result = rem;

            for(int i = count-1;i>0;i--){                
            result = result*rem;
     
            }

             storeResult= storeResult+result;
        }
        if (input == storeResult) {
            System.out.println(input+" is Armstrong");
        }else{
            System.out.println(input+" is not Armstrong");
        }
        
    }
}
