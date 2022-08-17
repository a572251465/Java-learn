/**
 * @Author lihh
 * @Date 2022/8/17 - 08 - 17
 * @Description: Java-learn
 * @version: 1.0
 */
public class TestVar01 {
    public static void main(String[] args) {
        // 表示进制给十进制进行赋值
        // 表示二进制赋值部分
        int num1 = 0b10;
        // 表示十进制赋值部分
        int num2 = 13;
        // 表示十六进制赋值部分
        int num3 = 0X16;
        // 表示八进制赋值部分
        int num4 = 017;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        // 定义byte类型的值 注意不能超过byte类型要求的长度
        byte b = 127;
        System.out.println(b);
        // 定义整型赋值的时候，默认就是十进制
        int i = 1234;
        System.out.println(i);

        // 即使赋值的类型是long类型。但是值超过了int的范围也是报错的。因为value值 默认就是int类型。
        // 除非强制告诉变量 赋值是什么类型的
        long num5 = 12345678910L;
        System.out.println(num5);

        // 在没有超过的情况下 想怎么赋值 就怎么赋值
        long num6 = 6;
        System.out.println(num6);
    }
}
