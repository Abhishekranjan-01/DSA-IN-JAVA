//  Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Start Entering The Numbers & Press 0 To Exit;");
        
        int input=1;
        int prevNum = 0;

        while (input!=0) {
            input =0 ;
            input=sc.nextInt();
            if(prevNum<input){
                prevNum = input;
            }

        }
        System.out.println("Largest Number:\t"+prevNum);  
    }
}
