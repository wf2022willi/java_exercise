package how_to_define;

public class private1 {

   //private 权限修饰符， 被private修饰的成员只能在本类中访问
    private String name; //外界无法访问

    //set
    public void setName(String n){
        name = n;

    }

    //get name ()
    public String getName(){
        return name;
    }


    private int age;

    public void setAge(int a){
        if (a >= 18 && a<= 45) {
            age = a;
        } else {
            System.out.println("wrong number");
        }
    }

    // get the age

    public int getAge() {
        return age;
    }
    String gender;
}
