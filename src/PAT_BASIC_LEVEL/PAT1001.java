package PAT_BASIC_LEVEL;

import java.util.ArrayList;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

/*
    1003
 */
public class PAT1001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for(int i = 0; i < count; i++){

            String tmp = in.next();
            boolean flag = PAT(tmp);
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    public static boolean PAT(String tmp){

       String[] A = tmp.split("A");
       boolean flag = true;
       for(int i = 0; i < A.length; i++){
           if(A[i].equals("P") || A[i].equals("T")  || A[i].equals("")){
               continue;
           }else{
               flag = false;
               break;
           }
       }

       

       return flag;
    }

}
