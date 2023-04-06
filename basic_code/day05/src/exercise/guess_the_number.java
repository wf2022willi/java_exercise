package exercise;
// 获取随机数 random

import java.util.Random;

public class guess_the_number {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(101);// nextInt(随机数的范围)  这个范围一定是从0 开始的 到最后一个数-1
        System.out.println(number);

        //create a random random number
        // ex. wir brauchen 7-15
        // -7   0~8
        // 8 + 1 = 9


        for (int i = 0; i < 10; i++) {
            Random r2 = new Random();
            int num2 = r2.nextInt(9) + 7;
            System.out.println(num2);
        }

    }
}
