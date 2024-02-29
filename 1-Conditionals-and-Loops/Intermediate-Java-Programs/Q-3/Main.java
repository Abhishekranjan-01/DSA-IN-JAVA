// Calculate Average Of N Numbers
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        boolean first = true;
        int input = 1,count = 0,sum = 0;
        System.out.println("Enter Start Entering The Numbers:\t Press 0 For Exit");
        while (input!=0) {
            
            input = sc.nextInt();
            sum+= input;
            count++;
        }
        System.out.println("sum:"+sum);
        System.out.println("Average = \t"+(sum/(count-1)));
    }
}