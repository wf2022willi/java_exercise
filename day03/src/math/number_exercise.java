package math;

import java.util.Scanner;

// 取模 % 小练习
//键盘录入一个三位数  将其拆分为个位 十位 百位
// 个位： 数值%10
// 十位 数值/10 %10
// 百位 数值/100 %10
public class number_exercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三位数");
        int number = sc.nextInt();

        //获取个位
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        //print
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);

    }
}
