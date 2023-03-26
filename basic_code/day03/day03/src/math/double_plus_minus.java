package math;



public class double_plus_minus {
    public static void main(String[] args) {

        // ++ -- funktion
        int a = 10;
        a++;
        System.out.println(a);// "11"
        ++a;
        System.out.println(a);// 11 + 1 = 12
        a --;
        System.out.println(a);// 12-1 = 11
        --a;
        System.out.println(a);// 11 - 1 = 10

        //参与运算
        // 先用后加： 先++
        int e = 10;
        int b = e++;
        System.out.println(b);// 10 此时e = 11

        //先加后用 : 后++
        int f = 10;
        int c = ++f;
        System.out.println(c); // 11 此时 f = 11
    }


}
