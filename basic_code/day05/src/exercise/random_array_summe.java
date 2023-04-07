package exercise;

import java.util.Random;

public class random_array_summe {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("die summe von der array ist " + sum);

        // average number
        int avg = sum / arr.length;
        System.out.println(" die duechschnitt ist " + avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count ++;

            }


        }
        System.out.println("there is " + count + " numbers smaller as the avg number");
    }
}
