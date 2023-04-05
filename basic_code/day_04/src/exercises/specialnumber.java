package exercises;

/*
一个整数x, 正序读（从左往右）还是倒序读（从右往左） 都是一样的数
program: 如果是， 就打印true， 如果不是， 就打印false
 */

public class specialnumber {
    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            int x = i ;
            int temp = x;
            int result = 0;
            System.out.println(i);
            while (x > 0) {
                int ge = x % 10;
                x = x / 10;
                result = result * 10 + ge;
                System.out.println(result);
                if (temp == result){
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
        }







    }
}
