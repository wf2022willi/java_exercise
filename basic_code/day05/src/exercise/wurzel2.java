package exercise;

//求平方根 只需要整数部分

import java.util.Scanner;

public class wurzel2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i <= number - 1; i++) {
            if (i * i == number) {
                System.out.println("这就是ping fang gen");
                System.out.println(i);
                break;
            } else if (i*i > number) {
                System.out.println("this is the number teil");
                System.out.println(i - 1);
                break;

            }

        }
    }
}
