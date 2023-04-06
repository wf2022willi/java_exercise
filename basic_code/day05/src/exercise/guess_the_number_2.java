package exercise;

import java.util.Random;
import java.util.Scanner;

public class guess_the_number_2 {

    public static void main(String[] args) {

        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("pls enter your guess number");
            int temp = sc.nextInt();

            if (temp < number) {
                System.out.println("too small");

            } else if (temp > number) {
                System.out.println("too large");

            } else {
                System.out.println("your right!!!");
                break;
            }
        }


    }
}
