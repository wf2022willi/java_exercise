package exercises;
// only for jdk 12 or higher


public class switch_1 {
    public static void main(String[] args) {
        int number = 1;
        switch (number) {
            case 1 -> {
                System.out.println("number 1");
            }
            case 2 ->{
                System.out.println("number 2");
            }
            case 10 ->{
                System.out.println("ten");
            }
            default ->{
                System.out.println(" others");
            }
        }
    }
}
