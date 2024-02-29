// Calculate Depreciation of Value

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Cost Of Asset:\t");
    float costOfAsset = sc.nextFloat();
    
    System.out.print("\nEnter The % It Will Depriciate Per Year:\t");
    float depriciationPercentage = sc.nextFloat();

    System.out.print("\nEnter Number Of Years:\t");
    float year = sc.nextFloat();
    
    while (year!=0) {
        
        costOfAsset -= (depriciationPercentage*costOfAsset)/100;
        year--;
    }
    System.out.println("The Cost Of Asset After "+year+" Year Is:\t"+costOfAsset);

    }

}
