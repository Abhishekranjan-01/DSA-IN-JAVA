import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number:\t");
        Scanner sc= new Scanner(System.in);

        int num1 = sc.nextInt();
        if(num1 % 2 == 0){
            System.out.println(num1+":\tEven");
        }else{
            System.out.println(num1+":\tOdd");
        }
    }
}