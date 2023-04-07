package exercise;

import java.util.Random;

public class make_array_random {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        Random r = new Random();

        // i : 1->9;  j : random number
        for (int i = 0; i < arr.length; i++) {
            int j = r.nextInt(arr.length);
            System.out.println(j);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
