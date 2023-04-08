package exercise;

/*
题目要求：
将数组arr中从索引from 开始到索引to结束的元素复制到新数组中
并将数组返回

 */

import java.util.Scanner;

public class reload_4 {

    public static void main(String[] args) {
        // original arrange
        int[] arrold = {1,2,5,8,9,6,22,56};
        Scanner sc1 = new Scanner(System.in);
        System.out.println("pls enter the first position of array");
        int from = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("pls enter the last position of array");
        int to = sc2.nextInt();

        int[] result = copyOfrange(arrold, from, to);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        // give it to the new arrange '  =  '
    }

    public static int[] copyOfrange(int[] arr, int from, int to) {
        // target arrange (empty arrange)

        int[] arrnew = new int[to - from ];
        // get the number from the old arrange
        for (int i = from - 1, j = 0; i <= to- 1 && j < to-from; i++, j++) {
            arrnew[j] = arr[i];
        }

        // return
        return arrnew;
    }

    public static void bianli_array (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            //System.out.print(arr[i] + ", ");
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }


        }
    }
}
