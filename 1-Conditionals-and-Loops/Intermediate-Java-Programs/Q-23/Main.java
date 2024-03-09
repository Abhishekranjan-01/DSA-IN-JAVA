// Check Leap Year Or Not

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Year To Check Wheather It Is Leap Year Or Not :\t");
    
        int year = sc.nextInt();

        if((year%4==0 && year%400==0) || year%100!=0){
            System.out.println(year + " Is Leap Year");
        }else{
            System.out.println(year + " Is Not Leap Year");
        }
    }
}
