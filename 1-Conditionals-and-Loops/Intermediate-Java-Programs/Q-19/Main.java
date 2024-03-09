// HCF Of Two Numbers Program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Numbers For HCF:\t");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sm = num1 < num2 ? num1 : num2 ;
        int h=0;






        for(h=sm ;h>=1;h--){
            if(num1%h==0 && num2%h==0)
            break;
        }
        System.out.println("Factor Of "+num1+" And "+num2+" : "+h);
    }
}
