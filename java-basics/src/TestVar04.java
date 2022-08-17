/**
 * @Author lihh
 * @Date 2022/8/17 - 08 - 17
 * @Description: Java-learn
 * @version: 1.0
 */
public class TestVar04 {
    public static void main(String[] args) {
        // int 类型 可以直接赋值给 double类型
        double d1 = 10;
        System.out.println(d1);

        // double类型 不能直接赋值给int类型
        int i = (int)10.1;
        System.out.println(i);

        double d2 = 10 + 'a' + 3333l + 22.22f + 22.2;
        System.out.println(d2);
    }
}
