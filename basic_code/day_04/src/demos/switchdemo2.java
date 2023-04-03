package demos;

// switch 省略 default

public class switchdemo2 {
    public static void main(String[] args) {
        int number = 4;
        switch (number) {
            case 1:
                System.out.println("number is 1");
                break;
            case 4:
                System.out.println("number is 4");
                break; // break 一定要写 否则会switch 穿透：程序会一直执行switch语句体
            case 20:
                System.out.println("number is 20");
                //break;
            default:
                System.out.println("fall");
        }
    }
}
