/**
 * @Author lihh
 * @Date 2022/8/19 - 08 - 19
 * @Description: Java-learn
 * @version: 1.0
 */
public class TestVar05 {
    public static void main(String[] args) {
        add(2, 2);
        add(2, 1,2);
        add(2.1, 2.2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
