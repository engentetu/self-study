package InterView;

import java.util.Scanner;

public class HuaWei1 {
    public static void main(String[] args) {
        System.out.println("hello!");
        q1();
    }

    // 题目：
    // 一个 0-1000 的整数，拆解为一个（本身）或多个连续自然数的和，按照自然数的个数从少到多输出各个方案 input =
    // solution，方案内的自然数按照从小到大排列
    public static void q1() {

        try (Scanner input = new Scanner(System.in)) {
            int m = input.nextInt();

            if (m <= 1000 && m >= 0) {

                for (int i = m / 2 + 1; i > 0; i--) {
                    int sum = i;
                    for (int j = i - 1; j > 0; j--) {
                        sum = sum + j;
                        if (sum > m) {
                            break;
                        }
                        if (sum == m) {
                            System.out.println("results:");
                            for (int r = j; r <= i; r++) {
                                System.out.println(r);
                            }
                            return;
                        }
                    }

                }

            } else {
                System.out.println("Invalid input value!");
            }
        }
    }
}
