package PAT_BASIC_LEVEL;

import java.util.Scanner;

/**
 * A����B
 * ����Ҫ����� A/B������ A �ǲ����� 1000 λ����������B �� 1 λ������������Ҫ������� Q ������ R��ʹ�� A=B��Q+R ������
 * ����һֱ��ʱ����C++ ʵ��֮��ͳ���
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
