// Input currency in rupees and output in USD.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter The Amount In In Ruppee To Get Equvalent Amount In USD:\t");

        Scanner input = new Scanner(System.in);

        float ruppee= input.nextFloat();

        System.out.println("As Of 19-02-2024:\n"+ruppee+" = "+(ruppee*0.012)+" USD");
    }
}
