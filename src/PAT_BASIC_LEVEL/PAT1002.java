package PAT_BASIC_LEVEL;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
PAT  1002    写出这个数

 */
public class PAT1002 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int n = 0;
        for(int i = 0; i < s.length() ; i++){
            int tmp = Integer.parseInt(String.valueOf(s.charAt(i)));
            n = n + tmp;
        }
        String s2 = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

      Map<Character, String> map = new HashMap<Character, String>() {
        {
            put('1', "yi");
            put('2', "er");
            put('3', "san");
            put('4', "si");
            put('5', "wu");
            put('6', "liu");
            put('7', "qi");
            put('8', "ba");
            put('9', "jiu");
            put('0', "ling");
        }
    };

        for(int i = 0; i < s2.length() - 1; i++){
            sb.append(new StringBuilder(map.get(s2.charAt(i))));
            sb.append(" ");
        }
        sb.append(map.get(s2.charAt(s2.length() - 1)));

        System.out.println(sb.toString());

        in.close();
    }

}
