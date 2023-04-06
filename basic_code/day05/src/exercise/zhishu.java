package exercise;

import java.util.Scanner;

// 求质数
public class zhishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter a number");
        int number = sc.nextInt();
        //定义一个变量 标记number是否是一个质数
        boolean flag = true;

        for (int i = 2; i < number ; i++) {

            if (number%i == 0){
                System.out.println("isnt a zhishu, break");
                flag = false;
                break;
            }




        }
        if (flag == true) {
                System.out.println("this is a zhishu");

            } else {
                System.out.println("isnt ");
        }


    }


}
