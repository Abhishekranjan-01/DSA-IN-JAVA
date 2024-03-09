//  Future Investment Value

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Investment Amount For Per Month:\t");
        int investmentAmountPerMonth = sc.nextInt();

        System.out.print("\nEnter Interest Rate Per Annum:\t");
        float interestRate = sc.nextFloat();


        System.out.print("\nFor How Many Years You Want To Invest:\t");
        float years = sc.nextFloat();
        
        System.out.println("\nEnter Compound Frequency:\t");
        int compoudingFrequency = sc.nextInt();


        System.out.println("Ans"+investmentAmountPerMonth*((1+((interestRate/100)/compoudingFrequency))*(compoudingFrequency*years)-1)/((interestRate/100)/compoudingFrequency));
    }
}
