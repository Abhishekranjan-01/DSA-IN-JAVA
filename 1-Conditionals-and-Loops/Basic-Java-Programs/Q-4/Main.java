// Area Of Isosceles Triangle 

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Base");
        float base = in.nextFloat();
            
        System.out.println("Enter The Height");
        float height = in.nextFloat();

        System.out.println("Area Of Isosceles:\t"+(base*height)/2);
    }
}