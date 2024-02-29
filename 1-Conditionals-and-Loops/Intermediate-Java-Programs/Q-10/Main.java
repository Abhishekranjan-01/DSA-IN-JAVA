// Calculate CGPA Java Program

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Total Marks You've Got:\t");
        int marks = sc.nextInt();

        System.out.print("\nEnter The Full Marks Of Your Result:\t");
        int fullMarks = sc.nextInt();

        System.out.println("CGPA:\t"+((marks*100f)/fullMarks)/9.5f);
    }
}
