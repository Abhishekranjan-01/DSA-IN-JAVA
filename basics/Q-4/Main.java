// Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Enter Number-1:\t");
        float num1 = input.nextFloat();
        System.out.println("Enter Number-2:\t");
        float num2 = input.nextFloat();


        System.out.println("Enter Any Arithmetic Operator For Calcultaion");
        String operator = input.next();

        if(operator.contains("+")){
            System.out.println("Sum=\t"+(num1+num2));
        }else  if(operator.contains("-")){
            System.out.println("Substraction=\t"+(num1-num2));
            check = false;
        }else  if(operator.contains("*")){
            System.out.println("Substraction=\t"+(num1*num2));
            check = false;
        }else  if(operator.contains("/")){
            System.out.println("Substraction=\t"+(num1/num2));
            check = false;
        }else{
            System.out.println("Invalid Input,Try Again");
        }
        }
        
    }
    
}
