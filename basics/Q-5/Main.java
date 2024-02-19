// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        if(num1>num2){
            System.out.println("Largest Number:\t"+num1);
        }else if(num2>num1){
            System.out.println("Largest Number:\t"+num2);
        }else{
            System.out.println("Both Numbers Are Equal");
        }
    }
}
