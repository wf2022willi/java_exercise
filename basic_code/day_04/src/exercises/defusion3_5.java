package exercises;

/*
既能被3整除 又可以被5整除的数字
 */

import java.util.Scanner;

public class defusion3_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number, this is the arrange in the programm");
        int arrange = sc.nextInt();
        int anzahl = 0;
        for (int i = 0; i < arrange; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                anzahl ++;

            }
        }
        System.out.println("die ergebnisse:" + anzahl);
    }
}
