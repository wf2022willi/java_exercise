
/*
方法的重载：

简单记忆： 同一个类中， 方法名相同， 参数不同的方法， 构成重载， 与返回值无关

参数不同： 个数不同， 类型不同， 顺序不同



 */


public class method_with_same_name {

    // an example
    public static int sum(int a, int b) {
        return a + b;

    }

    public static int sum (int a, int b, int c) {
        return a + b + c;

    }





    // compare two numbers which i don't know which type they are
    public static void main(String[] args) {
        compare(3,5);
    }

    public static void compare (byte a, byte b) {
        if (a == b) {
            System.out.println("die beide Zahöen sind identisch");
        } else {
            System.out.println("FAIL");
        }
        return;
    }
    public static void compare (short a, short b) {
         if (a == b) {
            System.out.println("die beide Zahöen sind identisch");
        } else {
            System.out.println("FAIL");
        }
        return;
    }
    public static void compare (int a, int b) {
         if (a == b) {
            System.out.println("die beide Zahöen sind identisch");
        } else {
            System.out.println("FAIL");
        }
        return;
    }
    public static void compare (long a, long b) {
         if (a == b) {
            System.out.println("die beide Zahöen sind identisch");
        } else {
            System.out.println("FAIL");
        }
        return;
    }
}
