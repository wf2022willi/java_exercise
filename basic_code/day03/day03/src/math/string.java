package math;
// 字符串案例
public class string {
    public static void main(String[] args) {
        System.out.println("123" + 123);
        //  从左到右逐个运行 “+”
        System.out.println(1 + 2 + 3 + "hahaha" + 5 + 6); // "6hahaha56"

        // 字符案例
        char c = 'a';
        int outp = c + 0;
        System.out.println(outp); // "97" --> ASCII 字符表 对应的数字
        // 字符 + 数字 时， 会先通过ASCII查询到数字再进行运算
        char c2 = 'a';
        System.out.println(c2 + " "+"abecdfg");



    }
}
