package PAT_BASIC_LEVEL;

import java.util.Scanner;

/**
 * A除以B
 * 本题要求计算 A/B，其中 A 是不超过 1000 位的正整数，B 是 1 位正整数。你需要输出商数 Q 和余数 R，使得 A=B×Q+R 成立。
 * 运行一直超时，换C++ 实现之后就成了
 */

public class PAT1017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bigone = in.next();
        int division = in.nextInt();

        int tmp = (bigone.charAt(0) - '0');
        if(  tmp/division != 0 ){
            System.out.print(tmp/division);
        }
        int ans2 = tmp % division;
        for(int i = 1; i < bigone.length(); i ++){
            tmp = bigone.charAt(i) - '0';
            tmp = ans2*10 + tmp;
            System.out.print(tmp/division);
            ans2 = tmp % division;
        }

        System.out.println(" " + ans2);

    }
}
