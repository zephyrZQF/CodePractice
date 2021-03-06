package PAT_BASIC_LEVEL;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * ���ֺڶ�
 * ������һ����λ���ֲ���ȫ��ͬ��4λ����������������Ȱ�4�����ְ��ǵ��������ٰ��ǵݼ�����Ȼ���õ�1�����ּ���2�����֣����õ�
 * һ���µ����֡�һֱ�ظ������������Ǻܿ��ͣ���С����ֺڶ���֮�Ƶ�6174��������������Ҳ��Kaprekar������
 * <p>
 * ���磬���Ǵ�6767��ʼ�����õ�
 * <p>
 * 7766 - 6677 = 1089
 * 9810 - 0189 = 9621
 * 9621 - 1269 = 8352
 * 8532 - 2358 = 6174
 * 7641 - 1467 = 6174
 * ... ...
 * <p>
 * �ָ�������4λ�����������д������ʾ����ڶ��Ĺ��̡�
 */

public class PAT1019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        int[] arrs = Arrs(num);

        while (true) {
            Arrays.sort(arrs);
            int first = 0;
            for (int i = 3; i >= 0; i--) {
                first = first * 10 + arrs[i];
            }

            int second = 0;
            for (int i = 0; i < 4; i++) {
                second = second * 10 + arrs[i];
            }

            int ans = first - second;
            if (ans == 6174) {
                System.out.printf("%04d - %04d = %04d\n", first, second, ans);
                break;
            } else if (ans == 0) {
                System.out.printf("%04d - %04d = %04d\n", first, second, ans);
                break;
            }
            System.out.printf("%04d - %04d = %04d\n", first, second, ans);
            arrs = Arrs(ans);
        }
    }

    public static int[] Arrs(int num) {
        int[] arrs = new int[4];
        for (int i = 0; i < 4; i++) {
            int tmp = num % 10;
            num = num / 10;
            arrs[i] = tmp;
        }
        return arrs;
    }
}
