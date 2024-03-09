// LCM Of Two Numbers

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter To Numbers For LCM:\t");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int h = num1 > num2 ? num1 : num2;

        while (h<=(num1*num2)) {
            if(h%num1==0 && h%num2==0)
                break;
            h++;
        }
        System.out.println("LCM Of "+num1+" And "+num2+" : "+h);
    }
}
