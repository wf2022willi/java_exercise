
/*
method （方法） 是程序中最小的单元

实际应用场景：将重复的代码或者具有独立功能的代码打包 ，以供调用， 提高代码可读性和可维护性

方法定义-> 方法调用

最简单的方法定义：
public static void methodname () {
    hier tippt man die code ein.
}

方法调用

methodname（）；

 */

public class method_demo {
    public static void main(String[] args) {

        // use the method
        plygame();
    }

    // define the method
    public static void plygame() {
        System.out.println("this");
        System.out.println("is");
        System.out.println("a");
        System.out.println("test");
    }
}
