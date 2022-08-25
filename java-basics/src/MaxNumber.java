/**
 * @Author lihh
 * @Date 2022/8/20 - 08 - 20
 * @Description: Java-learn
 * @version: 1.0
 */
public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {12, 3, 7, 4, 8, 125, 9, 45};
        int max = -1;

        for (int val: arr) {
            max = val > max ? val : max;
        }

        System.out.println(max);
    }
}
