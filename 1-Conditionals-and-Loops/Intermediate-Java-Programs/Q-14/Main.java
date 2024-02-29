// Armstrong Number In Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Number:\t");
        int input = sc.nextInt();
        int number = input;

        int power=0;
        
        while(number!=0) {
            number = number/10;
            power++;
        }

        number=input;

        int rem = 0;
        double sum=0;

        while (number!=0) {
            rem = number%10;
            number=number/10;

            sum+=Math.pow(rem, power);
        }

        if(sum == input){
            System.out.println(input+" Is Armstrong Number");
        }else{
            System.out.println(input+" Is Not Armstrong Number");

        }
    }
}
