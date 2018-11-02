package PAT_BASIC_LEVEL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *本题要求计算 A/B，其中 A 是不超过 1000 位的正整数，B 是 1 位正整数。你需要输出商数 Q 和余数 R，使得 A=B×Q+R 成立。
 *
 * 总是有超时 ， 改成C++直接就通过了
 */

public class PAT1017 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split("\\s+");

        String bigone = input[0];
        int division = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        int tmp = (bigone.charAt(0) - '0');
        if(  tmp/division != 0 ){
            sb.append(tmp/division);
        }
        int ans2 = tmp % division;
        for(int i = 1; i < bigone.length(); i ++){
            tmp = bigone.charAt(i) - '0';
            tmp = ans2*10 + tmp;
            sb.append(tmp/division);
            ans2 = tmp % division;
        }

        System.out.println(sb + " " + ans2);

    }
}

