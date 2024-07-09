import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Age:\t");
        Scanner sc= new Scanner(System.in);

        int age = sc.nextInt();
        if(isEligibleForVote(age)){
            System.out.println("Eligible For Vote");
        }else{
               System.out.println("Not eligible For Vote");
        }
    }

    static boolean isEligibleForVote(int age){
        return age >= 18 ? true : false;
    }
}