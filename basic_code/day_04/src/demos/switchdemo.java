package demos;

/*
swtich funktion:
swtich (表达式) {   //表达式 为 将要匹配的值

case 值1：
    语句体1；
    break；

case 值2：
    语句体2；
    break；
default: （约等于else）
    语句体；
    break；
    ...
    ...
}
case值只能是定量 不能为变量 且不可重复
 */

import java.util.Scanner;

public class switchdemo {
    public static void main(String[] args) {
        System.out.println("想吃的面：");
        Scanner sc = new Scanner(System.in);
        String noodle = sc.nextLine();

        switch (noodle){
            case "兰州拉面":
                System.out.println("chi lanzhou lamian");
                break;
            case "炸酱面":
                System.out.println("chi zhajiang mian ");
                break;
            case "banana":
                System.out.println("eat banana");
                break;
            case "dumplings":
                System.out.println("eat dumplings");
                break;
            default:
                System.out.println(" huhnsohn");
                break;
        }

    }
}
