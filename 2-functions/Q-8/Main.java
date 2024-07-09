import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Marks:\t");
        Scanner sc= new Scanner(System.in);

        int marks = sc.nextInt();
        System.out.println(getGrade(marks));
                
    }

    static String getGrade(int marks){
        
        if(marks<=100 && marks >=91) return "AA";
        if(marks<=90 && marks >=81)  return "AB";
        if(marks<=80 && marks >=71)  return "BB";
        if(marks<=70 && marks >=61)  return "BC";
        if(marks<=60 && marks >=51)  return "CD";
        if(marks<=50 && marks >=41)  return "DD";
        if(marks<=40)   return "Fail";
        return "Invalid Marks Input";
       
       
    }
}