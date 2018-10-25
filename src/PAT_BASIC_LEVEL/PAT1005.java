package PAT_BASIC_LEVEL;

/*
������(Callatz)�����Ѿ���1001�и������������������Ŀ������΢��Щ���ӡ�

��������֤�����Ȳ����ʱ��Ϊ�˱����ظ����㣬���Լ�¼�µ��ƹ�����������ÿһ����������� n=3 ������֤��ʱ��������Ҫ���� 3��5��8��4��2��1�������Ƕ� n=5��8��4��2 ������֤��ʱ�򣬾Ϳ���ֱ���ж������Ȳ������α��������Ҫ�ظ����㣬��Ϊ�� 4 �����Ѿ�����֤3��ʱ���������ˣ����ǳ� 5��8��4��2 �Ǳ� 3�����ǡ����������ǳ�һ�������е�ĳ���� n Ϊ���ؼ���������� n ���ܱ������е��������������ǡ�

���ڸ���һϵ�д���֤�����֣�����ֻ��Ҫ��֤���еļ����ؼ������Ϳ��Բ������ظ���֤���µ����֡������������ҳ���Щ�ؼ����֣������Ӵ�С��˳��������ǡ�

�����ʽ��
ÿ������������� 1 �������������� 1 �и���һ�������� K (<100)���� 2 �и��� K ��������ͬ�Ĵ���֤�������� n (1<n��100)��ֵ�����ּ��ÿո������

�����ʽ��
ÿ���������������ռһ�У����Ӵ�С��˳������ؼ����֡����ּ��� 1 ���ո��������һ�������һ�����ֺ�û�пո�
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PAT1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for(int i = 0; i < count ; i ++){
            int num = in.nextInt();
            list2.add(num);
            while ( num != 1){
                num = num%2 == 1 ? (3*num + 1)/2 : num/2;
                if( !list1.contains(num)){
                    list1.add(num);
                }
            }
        }
        in.close();

        for(int i = 0; i < count; i++){
            if(!list1.contains(list2.get(i))){
                list3.add(list2.get(i));
            }
        }

        Collections.sort(list3);
        for(int i = list3.size() - 1; i > 0; i --){
            System.out.print(list3.get(i) + " ");
        }
        System.out.print(list3.get(0));
    }
}
