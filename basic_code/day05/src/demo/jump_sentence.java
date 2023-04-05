package demo;

public class jump_sentence {
    public static void main(String[] args) {
        // 跳过某一次循环
        for (int i = 1; i < 6; i++) {
            if (i ==3 || i == 5) {
                continue;
            }
            System.out.println("i am eating" + i);

        }
    }
}
