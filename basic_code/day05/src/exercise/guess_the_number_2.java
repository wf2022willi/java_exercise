package exercise;

import java.util.Random;
import java.util.Scanner;

public class guess_the_number_2 {

    public static void main(String[] args) {

        // 附加条件：三次猜不中， 直接报答案
        int guess = 0;

        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            guess ++;
            if (guess == 3){
                System.out.println("right...");
                break;
            }

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
