package exercises;

import java.util.Scanner;

public class traning {
    public static void main(String[] args) {
        System.out.println("enter the werkday zahl");
        Scanner sc = new Scanner(System.in);
        int wochen = sc.nextInt();

        switch (wochen) {
            case 1:
                System.out.println("running");
                break;
            case 2:
                System.out.println("jumoping");
                break;
            case 3:
                System.out.println("cooking");
                break;
            case 4:
                System.out.println("camping");
                break;
            case 5:
                System.out.println("high drump");
                break;
            default:
                System.out.println("sleep!!!!!!!!");
                break;
        }
    }
}
