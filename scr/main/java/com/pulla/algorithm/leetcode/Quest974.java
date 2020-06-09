package com.pulla.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 A，返回其中元素之和可被 K 整除的（连续、非空）子数组的数目。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：A = [4,5,0,-2,-3,1], K = 5
 * 输出：7
 * 解释：
 * 有 7 个子数组满足其元素之和可被 K = 5 整除：
 * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subarray-sums-divisible-by-k
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Quest974 {

    public static void main(String[] args) {
        int[] A= {-6,-1,-5,10};
        Quest974 quest974 = new Quest974();
        int i = quest974.subarraysDivByK3(A, 9);
        System.out.println(i);
    }
    public int subarraysDivByK(int[] A, int K) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = A[i];
            if (sum % K == 0) {
                result++;
            }
            if (i == A.length - 1) {
                break;
            }
            for (int j = i+1; j < A.length; j++) {
                sum += A[j];
                if (sum % K == 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public int subarraysDivByK3(int[] A, int K){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //至少有一个匹配
        hashMap.put(0,1);
        int sum = 0;
        int result = 0;
        for (int a : A){
            sum  += a;
            int mod = (sum % K + K) % K;
            Integer same = hashMap.getOrDefault(mod, 0);
            result +=same;
            hashMap.put(mod,same+1);
        }
        return result;
    }

    /**
     * 我们令 P[i] = A[0] + A[1] + ... + A[i]P[i]=A[0]+A[1]+...+A[i]。那么每个连续子数组的和 \textit{sum}(i, j)sum(i,j) 就可以写成 P[j] - P[i-1]P[j]−P[i−1]（其中 0 < i < j0<i<j）的形式。此时，判断子数组的和能否被 KK 整除就等价于判断 (P[j] - P[i-1]) \bmod K == 0(P[j]−P[i−1])modK==0，根据 同余定理，只要 P[j] \bmod K == P[i-1] \bmod KP[j]modK==P[i−1]modK，就可以保证上面的等式成立。
     *
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/subarray-sums-divisible-by-k/solution/he-ke-bei-k-zheng-chu-de-zi-shu-zu-by-leetcode-sol/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param A
     * @param K
     * @return
     */
    public int subarraysDivByK2(int[] A, int K) {
        Map<Integer, Integer> record = new HashMap<>();
        record.put(0, 1);
        int sum = 0, ans = 0;
        for (int elem: A) {
            sum += elem;
            // 注意 Java 取模的特殊性，当被除数为负数时取模结果为负数，需要纠正
            int modulus = (sum % K + K) % K;
            int same = record.getOrDefault(modulus, 0);
            ans += same;
            record.put(modulus, same + 1);
        }
        return ans;
    }

}
