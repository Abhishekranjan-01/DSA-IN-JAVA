// Find Ncr 

import java.util.Scanner;

public class Main {

    public static int factorial(int num){
        int fact = 1;

        while (num>1) {
            fact *= num;
            num--; 
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Number Of Things:\t");
        int totalNumberOfThings = sc.nextInt();

        System.out.print("Enter Number Of Things To Be Chosen Out Of N Things:\t");
        
        int choodenOutOfNThings = sc.nextInt();

        System.out.println("CNR:=\t"+factorial(totalNumberOfThings)/(factorial(totalNumberOfThings-choodenOutOfNThings)*factorial(choodenOutOfNThings)));
    }
    
}