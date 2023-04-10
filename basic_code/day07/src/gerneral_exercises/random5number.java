package gerneral_exercises;

/*
随机产生一个验证码
长度 5

前4位是大写字母或小写字母
最后一位数字

 */

import java.util.Random;

public class random5number {

    public static void main(String[] args) {

        // 把大写字母小写字母放到一个数组当中

        char[] buchastabe = new char[52];
        for (int i = 0; i < buchastabe.length; i++) {

            // ASCII chart
            if (i <= 25) {
                // kleine buchastabe
                buchastabe[i] = (char) (97 + i);// 97 --> a, 98 --> b
            } else {
                // groß buchstabe
                //此时i从26 开始计数
                buchastabe[i] = (char) (65 + i - 26);// 65 --> A, 66 --> B
            }

            // buchastabe[i] = (char) (97 +i );// 97 --> a, 98 --> b
        }


        // zu überprüfen
        for (int i = 0; i < buchastabe.length; i++) {
            System.out.print(buchastabe[i]);
        }
        // 随机抽取4次

        Random r = new Random();

        String result = "";

        int number = r.nextInt(10);


        for (int i = 1; i <= 4; i++) {
            int randomindex = r.nextInt(buchastabe.length);

            //利用随即索引 打印字母

            System.out.println(buchastabe[randomindex]);

            // make it together

            result = result + " " + buchastabe[randomindex];

        }

        System.out.println(result);
        // 随机抽取一个数字9
        result = result + number;
        System.out.println(result);


    }


}
