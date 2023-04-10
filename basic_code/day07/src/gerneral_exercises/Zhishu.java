package gerneral_exercises;
// 判断 101-200之间有多少个质数 并输出所有质数


public class Zhishu {
    public static void main(String[] args) {

        int numtest = 100;
        int count = 0;

        for (int i = 101; i < 201; i++) {
            //System.out.println(i);
            boolean flag1 = true;
            for (int j = 2; j < i; j++) {
                // i: 2-99 number
                if (i % j == 0) {
                    flag1 = false;

                    break;
                }
            }

            if (flag1 == true) {
                System.out.println("the number" + i+"  is zhishu");
                count ++;
            } else {
                //System.out.println("sry" + i +" its not a zhishu");
            }



        }
        System.out.println("there are" + count +" zhishu");


        /*
        boolean flag = true;
        for (int i = 2; i < 100; i++) {
            // i: 2-99 number
            if (numtest % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("the number is zhishu");
        } else {
            System.out.println("sry its not a zhishu");
        }
        */



    }


}
