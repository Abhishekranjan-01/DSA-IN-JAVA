// Fibonacci Series In Java Programs

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Enter Number Of Sequence You Want In Fibonacci Series:\t");
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int num1=0,num2=1,sum=0;


        for(int i=1;i<=count;i++){
            System.out.println(i+"->  "+num1);
            sum=num1+num2;
            num2=num1;
            num1=sum;
        }
    }
}