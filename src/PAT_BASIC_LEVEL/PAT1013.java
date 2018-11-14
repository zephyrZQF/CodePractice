package PAT_BASIC_LEVEL;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 输出素数   令 Pi 表示第 i 个素数。现任给两个正整数 M≤N≤10^4 ，请输出 P_M 到 P_N
 * ​​  的所有素数。
 */

public class PAT1013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int count = 0;
        int num = 2;
        ArrayList<Integer> list = new ArrayList<>();
        in.close();

        while(count < end){
            if(isPrime(num)){
                 count ++;
                if(count >= start ){
                    list.add(num);
                }
            }
            num ++;
        }

        int index = 1;
        for (int i = 0; i < list.size() - 1; i ++) {
            if(index % 10 == 0){
                System.out.print(list.get(i));
                System.out.println();
            }else {
                System.out.print(list.get(i) + " ");
            }
            index++;
        }
        System.out.print(list.get(list.size() - 1));

    }

    private static boolean isPrime(int num){
        if(num == 2) return true;
        for(int i = 2; i < Math.sqrt(num) + 1; i++ ){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
