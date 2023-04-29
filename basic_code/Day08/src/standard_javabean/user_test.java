package standard_javabean;

public class user_test {
    public static void main(String[] args) {
        user u1 = new user();
        user u2 = new user("ww","2234","wieuyrui","man",3);
        System.out.println(u2.getAge());
        System.out.println(u2.getEmail());

    }
}
