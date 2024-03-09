// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.print("Enter The Month Number:\t");
        int monthIndex = sc.nextInt();

        int canGoOut = 0;

        if(monthIndex==1){
            for(int i = 1;i<=31;i++){
                if(i%2==0)
                    canGoOut++;
            }
            System.out.println("He Can Go Out "+canGoOut+" Days");
        }

       else if(monthIndex==2){
            for(int i = 1;i<=29;i++){
                if(i%2==0)
                    canGoOut++;
            }
            System.out.println("He Can Go Out "+canGoOut+" Days");
        }

       else if(monthIndex==3){
            for(int i = 1;i<=31;i++){
                if(i%2==0)
                    canGoOut++;
            }
            System.out.println("He Can Go Out "+canGoOut+" Days");
        }

       else if(monthIndex==4){
            for(int i = 1;i<=30;i++){
                if(i%2==0)
                    canGoOut++;
            }
            System.out.println("He Can Go Out "+canGoOut+" Days");
        }

        else if(monthIndex==5){
            for(int i = 1;i<=31;i++){
                if(i%2==0)
                    canGoOut++;
            }
            System.out.println("He Can Go Out "+canGoOut+" Days");
        }

        else if(monthIndex==6){
            for(int i = 1;i<=30;i++){
                if(i%2==0)
                    canGoOut++;
            }
            System.out.println("He Can Go Out "+canGoOut+" Days");
        }

        else if(monthIndex==7){
            for(int i = 1;i<=31;i++){
                if(i%2==0)
                    canGoOut++;
            }
            System.out.println("He Can Go Out "+canGoOut+" Days");
        }

        else if(monthIndex==8){
            for(int i = 1;i<=31;i++){
                if(i%2==0)
                    canGoOut++;
            }
            System.out.println("He Can Go Out "+canGoOut+" Days");
        }

        else if(monthIndex==9){
            for(int i = 1;i<=30;i++){
                if(i%2==0)
                    canGoOut++;
            }
            System.out.println("He Can Go Out "+canGoOut+" Days");
        }

        else if(monthIndex==10){
            for(int i = 1;i<=31;i++){
                if(i%2==0)
                    canGoOut++;
            }
            System.out.println("He Can Go Out "+canGoOut+" Days");
        }

        else if(monthIndex==11){
            for(int i = 1;i<=30;i++){
                if(i%2==0)
                    canGoOut++;
            }
            System.out.println("He Can Go Out "+canGoOut+" Days");
        }

        else if(monthIndex==12){
            for(int i = 1;i<=31;i++){
                if(i%2==0)
                    canGoOut++;
            }
            System.out.println("He Can Go Out "+canGoOut+" Days");
        }
        else
        {
            System.out.println("Invalid Month Index !!");
        }
    }
}
