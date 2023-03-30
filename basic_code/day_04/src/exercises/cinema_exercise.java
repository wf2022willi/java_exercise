package exercises;

import java.util.Scanner;

public class cinema_exercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your ticket number");
        int number = sc.nextInt();

        if (number %2 == 1 && number <= 100) {
            System.out.println("on the left side");
        } else if (number%2 == 0 && number <= 100){
            System.out.println("on the right side");
        } else {
            System.out.println("wrong number, try again");
        }


    }
}
