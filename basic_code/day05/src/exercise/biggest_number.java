package exercise;

public class biggest_number {
    public static void main(String[] args) {
        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;

            }
        }
        System.out.println("the biggest number is " + max);
    }
}
