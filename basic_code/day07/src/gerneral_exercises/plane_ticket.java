package gerneral_exercises;

import java.util.Scanner;

public class plane_ticket {
    public static void main(String[] args) {
         //键盘录入 机票原价 月份 头等舱 或 经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the preis");
        int ticket = sc.nextInt();
        System.out.println("enter the month");
        int month = sc.nextInt();
        System.out.println(" 0 first class, 1 eco class, ls enter");
        int seat = sc.nextInt();




    // 判断月份5-10 旺季
        if ( 5<= month && month <= 10) {
            // wang ji
            if (seat == 0) {
                // first class
                ticket = (int ) (ticket * 0.9);
            } else if (seat == 1) {
                // eco class
                ticket = (int ) (ticket * 0.85);

            } else {
                System.out.println("illegal number, enter again");
            }

        } else if (month >= 11 && month <= 12 || month >= 1 && month <= 4) {
            // dan ji
            if (seat == 0) {
                // first class
                ticket = (int ) (ticket * 0.7);
            } else if (seat == 1) {
                // eco class
                ticket = (int ) (ticket * 0.65);

            } else {
                System.out.println("illegal number, enter again");
            }
        } else {
            System.out.println("illegal number");
        }

        System.out.println(ticket);
        // 判断 经济舱 头等舱
            //计算实际价格
            //计算实际价格
    //打印 ， 返回
    }

}
