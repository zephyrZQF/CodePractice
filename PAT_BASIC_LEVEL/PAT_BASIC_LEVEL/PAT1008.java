package PAT_BASIC_LEVEL;

import java.util.Arrays;
import java.util.Scanner;

public class PAT1008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int prefix = in.nextInt();
        prefix %= num;
        int[] arr = new int[num];
        for (int i = 0, k = 0; i < num; i++) {
            if (i + prefix < num) {
                arr[i + prefix] = in.nextInt();
            } else {
                arr[k++] = in.nextInt();
            }
        }

        System.out.println(Arrays.toString(arr).replaceAll("\\[|\\]|\\,", ""));
    }

}
