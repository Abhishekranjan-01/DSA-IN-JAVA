// Find Npr
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

        System.out.print("Enter Number Of Things That Have To Be Selected And Arranged:\t");
        
        int thingsToBeSelected = sc.nextInt();

        System.out.println("NpR:=\t"+factorial(totalNumberOfThings)/factorial(totalNumberOfThings-thingsToBeSelected));

    }
    
}