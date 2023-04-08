package exercise;

//目标： 遍历数组

public class reload_1 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,44,5};
        System.out.print("(");

        bianli_array(arr);
        System.out.print(" )");
        System.out.println(); //不打印 之换行
        System.out.println("--------------");
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
