/*
带返回值的方法定义与应用

public static 返回值类型 方法名 （参数）{
    方法体；
    return 返回值
}

 */


public class method_with_return {
    public static void main(String[] args) {

        // direkt anwendung
        getSum(1,2,566); //控制台不会有任何输出


        //赋值调用
        double sum = getSum(5,66,992);
        System.out.println(sum);

        //输出调用
        System.out.println(getSum(55,9,20));

    }

    public static double getSum (int num1, int num2, int num3) {
        double result = num1 + num2 + num3;
        return result;

    }
}
