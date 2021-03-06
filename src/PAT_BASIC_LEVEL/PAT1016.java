package PAT_BASIC_LEVEL;

import java.util.Scanner;

public class PAT1016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num1 = in.next();
        String c1 = in.next();
        String num2 = in.next();
        String c2 = in.next();
        in.close();
        String ans1 = "", ans2 = "";

        int count1 = 0, count2 = 0;
        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == c1.charAt(0))
                ans1 += c1;
        }

        for (int i = 0; i < num2.length(); i++) {
            if (num2.charAt(i) == c2.charAt(0))
                ans2 += c2;
        }

        if (ans1.equals("") && ans2.equals("")) {
            System.out.println(0);
        } else {
            System.out.println(Integer.parseInt(ans1) + Integer.parseInt(ans2));
        }
    }
}
