package exercise;

// 求数组最大值

public class reload_2 {

    public static void main(String[] args) {
        int [] arr = {1,5,666,8,999};
        System.out.println(getMax(arr));
    }

    public static  int getMax (int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;
    }
}
