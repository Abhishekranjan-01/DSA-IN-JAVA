// Take integer inputs till the user enters 0 and print the sum of all numbers
// (HINT: while loop)
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Start Entering The Numbers & Press 0 To Exit;");
        int input = 1;
        int sum = 0;
        while(input != 0){
            input = sc.nextInt();
            sum = sum + input;
        }

        System.out.println("Sum=\t"+sum);
    }
}
