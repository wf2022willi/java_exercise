package math;

public class test_number {
    public static void main(String[] args) {
        int a = 10;
        double b = 12.3; // 小数 “double”
        double c = a + b;
        //数据类型需转换成一样才能运算
        System.out.println(c);

        //转换案例 ：小换大 小范围转换到大范围(系统自动转换）
        int e = 10;
        double f = e; // e = f =10.0
        // char byte short 运算时会自动转换为 int 再进行计算
        // 取值范围：byte < short < int < long < float < double

        // exercise 1
        int i = 10;
        long n = 100L;
        double d = 20.0;
        double result = i + n + d; //数据类型：double
        System.out.println(result);

        // 强制转换
        double fa = 12.45;
        int fb = (int) fa;
        System.out.println(fb);

        // example
        byte b1 = 10;
        byte b2 = 20;
        byte result2 = (byte) ((byte) b1 + b2);
        System.out.println(result2);

    }
}
