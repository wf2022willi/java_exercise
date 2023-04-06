package demo;

public class array_dynamik1 {

    public static void main(String[] args) {
        // example
        String[] students = new String[50];
        // hinzufügen
        students[0] = "yhang san";
        students[2] = "sss";
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
