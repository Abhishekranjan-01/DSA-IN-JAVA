// Perfect Number In Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number To Check Wheather It Is Perfect Number Or Not:\t");

        int number = sc.nextInt();
        int sum = 0;

        for(int i= 1;i<number;i++)
            if(number%i==0)
                sum+=i;

        
        if(sum==number)
            System.out.println(number + " Is Perfect Number");
        else
            System.out.println(number + " Is Not Perfect Number");
    }   

}
