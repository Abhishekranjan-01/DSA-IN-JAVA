// Area Of Rhombus

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter Diagonal 1:\t");
        Scanner in = new Scanner(System.in);

        float diagonal1 = in.nextFloat();
        System.out.println("Enter Diagonal1:\t");

        float diagonal2 = in.nextFloat();

        System.out.println("Area Of Rhombus:\t"+(diagonal1*diagonal2)/2);
    }
} 