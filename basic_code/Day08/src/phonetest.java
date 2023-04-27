public class phonetest {

    public static void main(String[] args) {
        phone p = new phone();

        p.brand = "xiao mi";
        p.price = 2233.1;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.Play();

    }
}
