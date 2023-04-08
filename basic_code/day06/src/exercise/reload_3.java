package exercise;

import java.util.Scanner;

// 判断数组中 的一个数是否存在
public class reload_3 {
    public static void main(String[] args) {
        int[] arr = {1,5,8,2,99};
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter a number...");
        int num = sc.nextInt();
        System.out.println(result(arr, num));

    }

    public static boolean result(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false; // 本题关键点： 什么地方写return false
    }


}
