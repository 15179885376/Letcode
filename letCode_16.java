import java.util.Arrays;

/**
 * @author Zzy
 * @create 2019  03  10:47
 * @desc
 **/

/*
给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.

与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class letCode_16 {
    public static void main(String[] args) {

    }
    public static int text(int[] a, int target) {
        Arrays.sort(a);
        int n = a.length;
        if (n == 0) {
            return 0;
        }
        int res = (a[0] + a[1] + a[2]);
        for (int i = 0; i < n; i++) {

            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int current = a[left] + a[right] + a[i];
                if (Math.abs(target - current) < Math.abs(target - res)) {
                    res = current;
                }
                if (current < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

}
