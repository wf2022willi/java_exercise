package exercises;

public class littel_challenge {
    public static void main(String[] args) {
        int devided =250;
        int devider = 9;
        int i = 0;
        while (devided >= devider){
            devided = devided - devider;
            i++;
        }
        System.out.println(devided);
        System.out.println(i);
    }
}
