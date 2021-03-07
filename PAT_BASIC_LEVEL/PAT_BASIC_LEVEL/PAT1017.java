package PAT_BASIC_LEVEL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * ����Ҫ����� A/B������ A �ǲ����� 1000 λ����������B �� 1 λ������������Ҫ������� Q ������ R��ʹ�� A=B��Q+R ������
 * <p>
 * �����г�ʱ �� �ĳ�C++ֱ�Ӿ�ͨ����
 */

public class PAT1017 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split("\\s+");

        String bigone = input[0];
        int division = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        int tmp = (bigone.charAt(0) - '0');
        if (tmp / division != 0) {
            sb.append(tmp / division);
        }
        int ans2 = tmp % division;
        for (int i = 1; i < bigone.length(); i++) {
            tmp = bigone.charAt(i) - '0';
            tmp = ans2 * 10 + tmp;
            sb.append(tmp / division);
            ans2 = tmp % division;
        }

        System.out.println(sb + " " + ans2);

    }
}

