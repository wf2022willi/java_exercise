package demo;
// 数组

/*
数据类型  数组名
ex int [] array
int array []
 */
public class array_1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,334,5};

        int[] array2 = {2,4,56,3};
        String[] string1 = {"des","eew","ddf"};

        System.out.println(string1); // [Ljava.lang.String;@65ab7765 -> 地址值 表示数据在内存中的位置
        System.out.println(string1[0]); // the first one pf array is "0"!!!!!
        // speicher ein zahl in der Array

        System.out.println(array1[0]);
        array1[0]= 3;
        System.out.println(array1[0]);


    }

}
