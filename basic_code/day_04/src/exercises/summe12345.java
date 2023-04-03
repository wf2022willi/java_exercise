package exercises;
// die Summer von "1_5"
public class summe12345 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 582; i ++) {
            System.out.println(i);
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
