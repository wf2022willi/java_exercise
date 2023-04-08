package exercise;

public class viereck_umfang {
    public static void main(String[] args) {
        umfang(2,7);
        falche(4.55);
    }

    public static void umfang(int a, int b) {
        int umfang1 = 2*(a + b);
        System.out.println(umfang1);

    }

    public static void falche(double r) {
        double flache = r * r * 3.14;
        System.out.println(flache);
    }

}
