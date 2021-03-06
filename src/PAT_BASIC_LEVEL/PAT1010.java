package PAT_BASIC_LEVEL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
��ƺ�����һԪ����ʽ�ĵ�������ע��x^n  nΪ��������һ�׵���Ϊnx^(n�6�11)��
 */

public class PAT1010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split("\\s+");  //����и��ӣ����ּ�Ŀո�ֹһ��
        int[] arrs = new int[arr.length];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = Integer.parseInt(arr[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrs.length / 2; i++) {
            if (arrs[i * 2] != 0 && arrs[i * 2 + 1] != 0) {
                list.add(arrs[i * 2] * arrs[i * 2 + 1]);
                list.add(arrs[i * 2 + 1] - 1);
            }
        }

        if (list.isEmpty()) {
            System.out.println("0 0");
        } else {
            System.out.println(list.toString().replaceAll("\\[|]|,", ""));
        }
    }
}
