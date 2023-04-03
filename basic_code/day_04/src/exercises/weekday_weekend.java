package exercises;

// weekday: 1-5
// weekend: 6,7

import java.util.Scanner;

public class weekday_weekend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of the weerk day");
        int num = sc.nextInt();
        switch (num) {
            case 1 -> {
                System.out.println("this is Monday");
            }
            case 2 -> {
                System.out.println("this is Weekday");
            }
            case 3 -> {
                System.out.println("this is Monday");
            }
            case 5 -> {
                System.out.println("this is Monday");
            }
            case 4 -> {
                System.out.println("this is Monday");
            }
            /*
            简化版：
            case 1,2,3,4,5 -> {
                System.out.println("this is Monday");
            }

            或者
            case 1 ：
            case 2 :
            case 3 :
            case 5 :
            case 4 : {
                System.out.println("this is Monday");


             */
            case 6 ->{
                System.out.println("Weekend");
            }
            case 7 ->{
                System.out.println("Weekend");
            }
            default -> {
                System.out.println("WRONG!");
            }
        }
    }
}
