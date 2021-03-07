package PAT_BASIC_LEVEL;

import java.util.Scanner;

/**
 * 1006	������ʽ�������
 */
public class PAT1006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        StringBuilder sb = new StringBuilder();
        int n = num / 100;
        num = num % 100;
        for (int i = 0; i < n; i++) {
            sb.append("B");
        }

        n = num / 10;
        num = num % 10;
        for (int i = 0; i < n; i++) {
            sb.append("S");
        }

        for (int i = 0; i < num; i++) {
            sb.append(i + 1);
        }
        System.out.println(sb.toString());
    }
}
