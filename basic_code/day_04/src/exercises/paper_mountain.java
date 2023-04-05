package exercises;

// ein unendlich große Papier falten
// einmal = 0.1mm
public class paper_mountain {
    public static void main(String[] args) {
        double number = 0.1;
        double falten = 0;
        while (number < 8844430) {
            number *= 2; // number = number *2
            falten++;
            System.out.println(number);
        }

        System.out.println(number);

        System.out.println(falten);
    }
}
