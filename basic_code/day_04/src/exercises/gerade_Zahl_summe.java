package exercises;

// 1-100 gerade zahl Summe

public class gerade_Zahl_summe {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i ++) { //  快捷键： 100.fori
            if (i % 2 == 0) {
                System.out.println(i);
                sum = sum + i;
                System.out.println(sum);
            }
        }
        System.out.println(sum);


    }
}
