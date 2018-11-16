package PAT_BASIC_LEVEL;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 数字黑洞
 * 给定任一个各位数字不完全相同的4位正整数，如果我们先把4个数字按非递增排序，再按非递减排序，然后用第1个数字减第2个数字，将得到
 *  一个新的数字。一直重复这样做，我们很快会停在有“数字黑洞”之称的6174，这个神奇的数字也叫Kaprekar常数。
 *
 *  例如，我们从6767开始，将得到
 *
 *  7766 - 6677 = 1089
 *  9810 - 0189 = 9621
 *  9621 - 1269 = 8352
 *  8532 - 2358 = 6174
 *  7641 - 1467 = 6174
 *  ... ...
 *
 *  现给定任意4位正整数，请编写程序演示到达黑洞的过程。
 */

public class PAT1019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        int[] arrs = Arrs(num);

        while(true){
            Arrays.sort(arrs);
            int first = 0;
            for(int i = 3; i >= 0; i--){
                first = first*10 + arrs[i];
            }

            int second = 0;
            for(int i = 0; i < 4; i++){
                second = second*10 +arrs[i];
            }

            int ans = first - second;
            if(ans == 6174){
                System.out.printf("%04d - %04d = %04d\n",first,second,ans);
                break;
            }else if(ans == 0){
                System.out.printf("%04d - %04d = %04d\n",first,second,ans);
                break;
            }
            System.out.printf("%04d - %04d = %04d\n",first,second,ans);
            arrs = Arrs(ans);
        }
    }

    public static int[] Arrs(int num){
        int[] arrs = new int[4];
        for(int i = 0;i < 4; i++){
            int tmp =  num % 10;
            num = num / 10;
            arrs[i] = tmp;
        }
        return arrs;
    }
}
