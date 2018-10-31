package PAT_BASIC_LEVEL;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 给定一系列正整数，请按要求对数字进行分类，并输出以下 5 个数字：
 *
 * A1 = 能被 5 整除的数字中所有偶数的和；
 * A2 = 将被 5 除后余 1 的数字按给出顺序进行交错求和，即计算 n1−n2+n3−n4⋯；
 * A3 = 被 5 除后余 2 的数字的个数；
 * A4 = 被 5 除后余 3 的数字的平均数，精确到小数点后 1 位；
 * A5 = 被 5 除后余 4 的数字中最大数字。
 */
public class PAT1012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[5];
        int sign = 1;
        int count = 0;
        int count1 = 0;

        int n = in.nextInt();
        for(int i = 0; i < n ; i++){
            int num = in.nextInt();
            switch (num % 5){
                case 0:
                    if(num % 2 == 0){
                        A[0] += num;
                    }

                    break;
                case 1:
                    count1 ++;
                    A[1] += sign*num;
                    sign *= -1;
                    break;
                case 2:
                    A[2] += 1;
                    break;
                case 3:
                    A[3] += num;
                    count ++;
                    break;
                case 4:
                    A[4] = A[4] > num ? A[4] : num;
                    break;
            }
        }

        if(A[0] == 0){
            System.out.print("N ");
        }else {
            System.out.print(A[0] + " ");
        }
        if(count1 == 0){
            System.out.print("N ");
        }else {
            System.out.print(A[1] + " ");
        }
        if(A[2] == 0){
            System.out.print("N ");
        }else {
            System.out.print(A[2] + " ");
        }
        if(A[3] == 0){
            System.out.print("N ");
        }else {
            DecimalFormat df = new DecimalFormat("0.0");//格式化小数
            System.out.print(df.format((float)A[3]/count) + " ");
        }
        if(A[4] == 0){
            System.out.print("N");
        }else {
            System.out.print(A[4]);
        }

    }
}
