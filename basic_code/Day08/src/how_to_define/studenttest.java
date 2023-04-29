package how_to_define;

public class studenttest {

    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("test2",3);

        System.out.println(s2.getName());

    }
}
