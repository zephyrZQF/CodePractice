package PAT_BASIC_LEVEL;

import java.util.Scanner;

/**
  * 1009	Ëµ·´»°
 */

public class PAT1009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        String reve = new StringBuilder(str).reverse().toString();
        String[] arrReve = reve.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arrReve.length - 1; i ++){
            sb.append(new StringBuilder(arrReve[i]).reverse());
            sb.append(" ");
        }
        sb.append(new StringBuilder(arrReve[arrReve.length - 1]).reverse());
        System.out.println(sb);
    }
}
