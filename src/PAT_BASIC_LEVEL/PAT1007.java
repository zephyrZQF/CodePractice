package PAT_BASIC_LEVEL;

import java.util.ArrayList;
import java.util.Scanner;

public class PAT1007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < n ; i ++){
            boolean flag = isPrime(i+1);
            if(flag){
                list.add(i+1);
            }
        }

        for(int i = 0; i < list.size() - 1; i ++){
            if(list.get(i+1) - list.get(i) == 2)
                count ++;
        }
        System.out.println(count);
    }

    private static boolean isPrime(int num){
        if(num == 2) return true;
        for(int i = 2; i < Math.sqrt(num) + 1; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

}
