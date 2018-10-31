package PAT_BASIC_LEVEL;

import java.util.Scanner;
public class PAT1011{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] result = new boolean[n];
        for(int i = 0; i < n; i++)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            result[i] = c - a < b;
        }
        for(int i = 0; i < n; i++)
            System.out.println("Case #" + (i+1) + ": "+result[i]);
    }
}
