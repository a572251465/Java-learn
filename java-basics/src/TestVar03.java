/**
 * @Author lihh
 * @Date 2022/8/17 - 08 - 17
 * @Description: Java-learn
 * @version: 1.0
 */
public class TestVar03 {
    public static void main(String[] args) {
        char c1 = 'A';
        System.out.println(c1);

        // 字符类型 在参与运行的时候，其实是按照ASCII编码转换为对应的数字，再进行计算的
        System.out.println(c1 + 90);

        // 如果将字符类型的值 赋值给int类型 其实也是通过转换后的数字 赋值给int类型的
        int a = 'B';
        System.out.println(a);

        float f1 = 'B';
        System.out.println(f1);

        // 如果将一个数字赋值给了char类型 会将数字转换为char数值 再进行赋值
        char c2 = 20013;
        System.out.println(c2);

        // 在运算之前 先将字符2进行转换为对应的数字
        // 将转换后的数字跟int类型的2 相加
        // 最后因为赋值给char类型 所以将结果再次转换为char类型的值
        char res = 2 + '2';
        System.out.println(res);
    }
}
