package math;

// this is a exercise for ternary operation

import java.util.Scanner;

public class two_tigers_exer {
    public static void main(String[] args) {
        // system.in
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the weight of the first tiger.");
        int tiger1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the weight of the first tiger2.");
        int tiger2 = sc2.nextInt();

        String re = tiger1 == tiger2? "same" : "not the same";
        System.out.println(re);

    }
}
