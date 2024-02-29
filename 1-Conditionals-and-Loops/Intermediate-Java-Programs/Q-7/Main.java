// Power In Java

import java.util.Scanner;

public class Main {

public static float calculatePower(float base,int power){

    float ans=1;

    while (power!=0) {

        ans*=base;
        power--;
    }
    return ans;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Base:\t");
        float base = sc.nextFloat();

        System.out.println("Enter Power:\t");
        int power = sc.nextInt();

        System.out.println("Power Of "+base+" Is:\t "+calculatePower(base,power));
    }
    

}