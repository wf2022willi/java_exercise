package demo;

public class array_2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 23, 56, 5, 3, 46, 3, 45, 2, 3, 5,};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[3]);

        // how to print all the number of a array?
        System.out.println(arr1.length);
        int wss = arr1.length;
        for (int i = 0; i < wss; i++) {
            System.out.println(arr1[i]);

        }
        // length funcion
        // .length

        // quick funtion (idea)
        // arr1.fori
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
