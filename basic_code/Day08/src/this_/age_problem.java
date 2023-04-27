package this_;

public class age_problem {
    private int age;

    public void method(){
        int age = 10;//成员变量
        System.out.println(age); //局部变量
        System.out.println(this.age); // 如果没有this， 将自动采用就近原则，直接使用局部变量
    }
}
