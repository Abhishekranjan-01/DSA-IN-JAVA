//  Sum Of N Numbers

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Start Entering The Number & Enter 0 To Get It's Sum:");
    
    float input = 1,sum=0;

    while (input!=0) {
        input= sc.nextFloat();
        sum+=input;
    }

    System.out.print("\nSum Of inputs Is:\t"+sum);
} 
    
 }