package math;

//三元表达式
//格式： 关系表达式？ 表达式1：表达式2；

public class ternary_operation {
    public static void main(String[] args) {
        //example
        int num1 = 20;
        int num2 = 90;

        //关系表达式

        int result = num1 > num2 ? num1: num2;// 必须要被使用
        System.out.println(result);
        System.out.println(num1 > num2 ? num1: num2);//  if the relation is true, the first number will be printed, ; when it's false, then the second will be printed


    }
}
