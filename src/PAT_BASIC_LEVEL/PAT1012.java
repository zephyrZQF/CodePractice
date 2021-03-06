package PAT_BASIC_LEVEL;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * ����һϵ�����������밴Ҫ������ֽ��з��࣬��������� 5 �����֣�
 * <p>
 * A1 = �ܱ� 5 ����������������ż���ĺͣ�
 * A2 = ���� 5 ������ 1 �����ְ�����˳����н�����ͣ������� n1�6�1n2+n3�6�1n4�6�8��
 * A3 = �� 5 ������ 2 �����ֵĸ�����
 * A4 = �� 5 ������ 3 �����ֵ�ƽ��������ȷ��С����� 1 λ��
 * A5 = �� 5 ������ 4 ��������������֡�
 */
public class PAT1012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[5];
        int sign = 1;
        int count = 0;
        int count1 = 0;
//        һֱ�и�caseͨ�������������ֽ�����ӿ��ܵ���0������һֱ���Ƿ����0�ж�

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            switch (num % 5) {
                case 0:
                    if (num % 2 == 0) {
                        A[0] += num;
                    }

                    break;
                case 1:
                    count1++;
                    A[1] += sign * num;
                    sign *= -1;
                    break;
                case 2:
                    A[2] += 1;
                    break;
                case 3:
                    A[3] += num;
                    count++;
                    break;
                case 4:
                    A[4] = A[4] > num ? A[4] : num;
                    break;
            }
        }

        if (A[0] == 0) {
            System.out.print("N ");
        } else {
            System.out.print(A[0] + " ");
        }
        if (count1 == 0) {
            System.out.print("N ");
        } else {
            System.out.print(A[1] + " ");
        }
        if (A[2] == 0) {
            System.out.print("N ");
        } else {
            System.out.print(A[2] + " ");
        }
        if (A[3] == 0) {
            System.out.print("N ");
        } else {
            DecimalFormat df = new DecimalFormat("0.0");//��ʽ��С��
            System.out.print(df.format((float) A[3] / count) + " ");
        }
        if (A[4] == 0) {
            System.out.print("N");
        } else {
            System.out.print(A[4]);
        }

    }
}
