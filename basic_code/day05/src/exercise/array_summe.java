package exercise;

public class array_summe {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        // summe variable
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        System.out.println(sum);

    }

}
