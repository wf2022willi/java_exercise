package math;

// this is an exercise for ternary operations
// we want to find out the largest height

// ctrl + alt + L 快捷键： 自动对齐

public class who_is_the_heighst {
    public static void main(String[] args) {

        int h1 = 150, h2 = 210, h3 = 165; // define the three heights;
        int teilre = h1 > h2 ? (h1 > h3 ? h1 : h3) : (h2 > h3 ? h2 : h3);

        System.out.println(teilre);
    }
}
