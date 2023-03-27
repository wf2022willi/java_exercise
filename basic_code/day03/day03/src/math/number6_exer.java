package math;

import java.util.Scanner;

public class number6_exer {
    public static void main(String[] args) {
        /*

         */
        System.out.println("please enter number 1");

        Scanner sc1 = new Scanner(System.in);
        int i1 = sc1.nextInt();
        System.out.println("please enter number 2");
        Scanner sc2 = new Scanner(System.in);
        int i2 = sc2.nextInt();
        int summe = i1 + i2;
        System.out.println("其中一个是6？");
        System.out.println(i1 == 6 || i2 == 6);
        System.out.println("summe是6 的倍数？");
        System.out.println(summe%6 == 0);

    }
}
