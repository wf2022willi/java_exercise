package exercise;

// dont print 7!

public class ohne7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            if (i % 7 == 0 || i / 10 % 10 == 7|| i% 10 == 7){
                System.out.println("pass");
                continue;
            }
            System.out.println(i);

        }
    }
}
