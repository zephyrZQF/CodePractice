package PAT_BASIC_LEVEL;

import java.util.Scanner;

/*
    1001   3n+1
 */
public class PAT1001 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        int count = 0;

        while (num != 1) {
            num = num % 2 == 0 ? num / 2 : (num * 3 + 1) / 2;
            count++;
        }

        System.out.print(count);
    }
}
