package gerneral_exercises;

import java.util.Scanner;


// ctrl + alt + M 快捷键 快速抽取方法
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


        if ( 5<= month && month <= 10) {
            getPreis(ticket, seat, 0.9, 0.85);  // variable : ctrl + p

        } else if (month >= 11 && month <= 12 || month >= 1 && month <= 4) {
            getPreis(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("illegal number");
        }

        System.out.println(ticket);

    }

    // verbessern die Code

    // which variable do i need ? ticket seat rabatt
    public static  int getPreis(int ticket, int seat, double rabatt0, double rabatt1) {
        if (seat == 0) {
                // first class
                ticket = (int ) (ticket * rabatt0);
            } else if (seat == 1) {
                // eco class
                ticket = (int ) (ticket * rabatt1);

            } else {
                System.out.println("illegal number, enter again");
            }
        return ticket;

    }
    // inkl. return? yes!






}
