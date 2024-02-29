// Calculate Discount Of Product
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter List Price Of The Product:\t ");
        float listPrice = sc.nextInt();

        System.out.print("\nEnter The Discount Percent That Will be Given On The Product:\t");
        float discountPercent = sc.nextFloat();

        float discountedAmount = listPrice*(discountPercent/100);

        System.out.println("The Product Will Sell On "+(listPrice-discountedAmount)+" Price After Disocunt Of "+discountedAmount+" Amount That is "+discountPercent+"% Discount On The Product.");


    
    }
}