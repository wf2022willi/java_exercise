package how_to_define;

//构造方法的格式
/* 修饰符（public/private) 类名（参数） {
        方法体;
  }

*/
public class student {
    private String name;
    private int age;

    //空参构造 （不带参数）
    public student (){
        System.out.println("testtesttest...");
    }

    //带参构造
    public student(String name, int age){
        this.name=name;
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public void setName() {
        this.name = name;
    }




}
