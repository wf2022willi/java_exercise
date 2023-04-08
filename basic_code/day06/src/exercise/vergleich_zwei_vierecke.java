package exercise;



public class vergleich_zwei_vierecke {
    public static void main(String[] args) {
        double a1 = area(3.7,57);
        double a2 = area(37,5.7);

        if (a1 > a2) {
            System.out.println("a1 > a2");

        } else  {
            System.out.println("a2 >a1");
        }
    }

    public static double area (double length, double width) {
        double area = length * width;
        return area;
    }
}
