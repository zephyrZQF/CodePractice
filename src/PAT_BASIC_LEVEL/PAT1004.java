package PAT_BASIC_LEVEL;

import java.util.Scanner;

public class PAT1004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());
        int max = 0;
        int min = 101;
        String minName = "";
        String maxName = "";
        for(int i = 0; i < count ; i ++){
            String s = in.nextLine();
            String[] students = s.split(" ");
            if(Integer.parseInt(students[2]) > max){
                max = Integer.parseInt(students[2]);
                maxName = students[0] + " " + students[1];
            }
            if(Integer.parseInt(students[2]) < min){
                min = Integer.parseInt(students[2]);
                minName = students[0] + " " + students[1];
            }
        }
        System.out.println(maxName + " " + max);
        System.out.println(minName + " " + min);

    }
}
