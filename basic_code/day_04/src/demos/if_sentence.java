package demos;

import java.util.Scanner;

/*

if (关系表达式) {
执行语句体
}
其他语句
 */
public class if_sentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量");
        int wine = sc.nextInt();


        if(wine > 2){
            System.out.println("great!");
        }
        //如果大括号内只有一行代码 大括号可以省略， 但最好不要

        boolean flag = true;
        if (flag == true){
            System.out.println("this is true");

        }

        if (flag){
            System.out.println("true 2");

        }

    }
}
