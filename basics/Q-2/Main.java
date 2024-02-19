// Take name as input and print a greeting message for that particular name

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = input.nextLine();

        System.out.println("Welcome "+name+" To Data Structures And Algorithms");
    }
}