package demos;

/*
if(关系表达式）{
执行语句体1；
} else {
执行语句体2；
}
 */

import java.util.Scanner;

public class if02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pls nter the money");
        int money = sc.nextInt();
        if (money >= 100) {
            System.out.println("big meal");

        } else {
            System.out.println("go to jail!");
        }

    }
}
