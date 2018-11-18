package PAT_BASIC_LEVEL;

import java.util.*;

/**
 * 输入第1行给出正整数N（<=105），即双方交锋的次数。随后N行，每行给出一次交锋的信息，即甲、乙双方同时给出的的手势。C代表“锤子”、J代表“剪刀”、B代
 * 表“布”，第1个字母代表甲方，第2个代表乙方，中间有1个空格。
 *
 * 输入第1行给出正整数N（<=105），即双方交锋的次数。随后N行，每行给出一次交锋的信息，即甲、乙双方同时给出的的手势。C代表“锤子”、J代表“剪刀”、B代
 * 表“布”，第1个字母代表甲方，第2个代表乙方，中间有1个空格。
 */
public class PAT1018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ans = new int[3];

        int[] cou1 = new int[3];
        int[] cou2 = new int[3];

        int num = in.nextInt();
        for(int i = 0; i < num; i++){
            String A = in.next();
            String B = in.next();
            if(A.equals(B)){
                ans[1] ++;
            }
            switch (A){
                case "B":
                    if(B.equals("C")){
                        ans[0] ++;
                        cou1[0]++;
                    }
                    if(B.equals("J")){
                        ans[2] ++;
                        cou2[2]++;

                    }
                    break;
                case "C":
                    if(B.equals("J")){
                        ans[0] ++;
                        cou1[1] ++;
                    }
                    if(B.equals("B")){
                        ans[2] ++;
                        cou2[0]++;
                    }
                    break;
                case "J":
                    if(B.equals("B")){
                        ans[0] ++;
                        cou1[2] ++;
                    }
                    if(B.equals("C")){
                        ans[2] ++;
                        cou2[1]++;
                    }
                    break;
            }
        }
        in.close();
        System.out.println(ans[0] + " "+ ans[1] + " "+ans[2]);
        System.out.println(ans[2] + " "+ ans[1] + " "+ans[0]);


        System.out.print(getMax(cou1[0],cou1[1],cou1[2])+ " "+getMax(cou2[0],cou2[1],cou2[2]));
    }
    public static char getMax(int B, int C, int J) {
        if (B >= C && B >= J) {
            return 'B';
        } else if (J >= C && J > B) {
            return 'J';
        } else
            return 'C';

    }
}
