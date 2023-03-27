package math;

//+= , -=, *= , /=, %=

public class assignment_operator {
    public static void main(String[] args) {
        // +=
        // regel: left + right and then give the nummber to the left side;
        //example
        int a = 10;
        int b = 20;
        a +=b;
        System.out.println("a " + a);// a = a+b
        System.out.println("b:"+ b);

        double s = 1;
        s +=1; // it's the same as "s++;"
        System.out.println(s);


    }
}
