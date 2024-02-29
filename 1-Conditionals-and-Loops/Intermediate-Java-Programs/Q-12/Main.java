// Calculate Average Marks

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Start Entering The Marks & Enter 0 To Get It's Average:");
    
    float marks = 1,sum=0;
    int count=0;
    while (marks!=0) {
        marks= sc.nextFloat();
        sum+=marks;
        count++;
    }

    System.out.print("\nAverage Marks:\t"+(sum/(count-1)));
} 
    
 }