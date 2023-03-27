package math;

public class logic_operator {
    public static void main(String[] args) {
        // &, |, ^, !
        System.out.println( true & true);
        System.out.println( false & true);
        System.out.println( true & false);
        System.out.println( false & false);
        //  ONLY WHEN on both seide "true", then "true", otherwise false.

        //|
        System.out.println(true | true);
        System.out.println(false | true);
        System.out.println(true | false);
        System.out.println(false | false);// ONLY WHEN on both seite "false", than false, otherwise true

        System.out.println("------------");

        // ^ 异或 相同false, 不同true
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // ! 逻辑非 取反
        System.out.println(!true);// false
        System.out.println(!false); // true

        System.out.println("------------");
        //|| short "or" ; the same function as |. when the left side is true, then the right side will not be treated
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(true && false);
        System.out.println(false && true);

        System.out.println("------------");
        //&& short "and" ; the same function as &; when the left side is true, then the right side will not be treated
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // exmaple
        int a = 10;
        int b = 9;
        boolean result = ++a<5 && ++b <10;
        System.out.println(result);





    }
}
