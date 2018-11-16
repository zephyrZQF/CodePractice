package PAT_BASIC_LEVEL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

/**
 *德才论
 *
 *
 * 输入第1行给出3个正整数，分别为：N（<=105），即考生总数；L（>=60），为录取最低分数线，即德分和才分均不低于L的考生才有资格
 * 被考虑录取；H（<100），为优先录取线——德分和才分均不低于此线的被定义为“才德全尽”，此类考生按德才总分从高到低排序；才分不到
 * 但德分到线的一类考生属于“德胜才”，也按总分排序，但排在第一类考生之后；德才分均低于H，但是德分不低于才分的考生属于“才德兼
 * 亡”但尚有“德胜才”者，按总分排序，但排在第二类考生之后；其他达到最低线L的考生也按总分排序，但排在第三类考生之后。
 *
 * 随后N行，每行给出一位考生的信息，包括：准考证号、德分、才分，其中准考证号为8位整数，德才分为区间[0, 100]内的整数。数字间以空格分隔。
 */

public class PAT1015 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, L, H;
        N = in.nextInt();
        L = in.nextInt();
        H = in.nextInt();

        List<Student> Level1 = new ArrayList<>();
        List<Student> Level2 = new ArrayList<>();
        List<Student> Level3 = new ArrayList<>();
        List<Student> Level4 = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int StudentNum = in.nextInt();
            int DeScore = in.nextInt();
            int CaiScore = in.nextInt();

            if(DeScore >= L && CaiScore >= L){
                Student stu = new Student(StudentNum, DeScore, CaiScore);
                if(DeScore >= H && CaiScore >= H){
                    Level1.add(stu);
                }else if(DeScore >= H){
                    Level2.add(stu);
                }else if( DeScore >= CaiScore){
                    Level3.add(stu);
                }else {
                    Level4.add(stu);
                }
            }
        }

        Collections.sort(Level1);
        Collections.sort(Level2);
        Collections.sort(Level3);
        Collections.sort(Level4);

        System.out.println(Level1.size() + Level2.size() + Level3.size() + Level4.size());

        for(Student stu:Level1){
            System.out.println(stu.toString());
        }
        for(Student stu:Level2){
            System.out.println(stu.toString());
        }
        for(Student stu:Level3){
            System.out.println(stu.toString());
        }
        for(Student stu:Level4){
            System.out.println(stu.toString());
        }

    }
}

class Student implements Comparable<Student>{
    int StudentNum;
    int DeScore;
    int CaiScore;
    int Total;

    public Student(int StudentNum, int DeScore, int CaiScore){
        this.StudentNum = StudentNum;
        this.DeScore = DeScore;
        this.CaiScore = CaiScore;
        this.Total = this.DeScore + this.CaiScore;
    }

    public String toString(){
        return StudentNum+" "+DeScore+" "+CaiScore;
    }

    @Override
    public int compareTo(Student o) {
        if(this.Total != o.Total){
            return o.Total - this.Total;
        }
        if(this.DeScore != o.DeScore){
            return o.DeScore - this.DeScore;
        }
        return this.StudentNum - o.StudentNum;
    }
}
