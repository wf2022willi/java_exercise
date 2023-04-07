package exercise;
/*
{1,2,3,4,5} -> {5,4,3,2,1}
*/
public class change_the_number_in_the_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // 0 -> 5; 5 -> 0
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // official change
        for (int i = 0 , j = arr.length - 1; i < j ; i++, j--) {
            // change i and j
            int temp2 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp2;

        }
        System.out.println("------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }

}
