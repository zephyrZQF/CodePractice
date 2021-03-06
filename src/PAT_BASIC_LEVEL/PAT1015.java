package PAT_BASIC_LEVEL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

/**
 * �²���
 * <p>
 * <p>
 * �����1�и���3�����������ֱ�Ϊ��N��<=105����������������L��>=60����Ϊ¼ȡ��ͷ����ߣ����·ֺͲŷ־�������L�Ŀ��������ʸ�
 * ������¼ȡ��H��<100����Ϊ����¼ȡ�ߡ����·ֺͲŷ־������ڴ��ߵı�����Ϊ���ŵ�ȫ���������࿼�����²��ִܷӸߵ������򣻲ŷֲ���
 * ���·ֵ��ߵ�һ�࿼�����ڡ���ʤ�š���Ҳ���ܷ����򣬵����ڵ�һ�࿼��֮�󣻵²ŷ־�����H�����ǵ·ֲ����ڲŷֵĿ������ڡ��ŵ¼�
 * ���������С���ʤ�š��ߣ����ܷ����򣬵����ڵڶ��࿼��֮�������ﵽ�����L�Ŀ���Ҳ���ܷ����򣬵����ڵ����࿼��֮��
 * <p>
 * ���N�У�ÿ�и���һλ��������Ϣ��������׼��֤�š��·֡��ŷ֣�����׼��֤��Ϊ8λ�������²ŷ�Ϊ����[0, 100]�ڵ����������ּ��Կո�ָ���
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
        for (int i = 0; i < N; i++) {
            int StudentNum = in.nextInt();
            int DeScore = in.nextInt();
            int CaiScore = in.nextInt();

            if (DeScore >= L && CaiScore >= L) {
                Student stu = new Student(StudentNum, DeScore, CaiScore);
                if (DeScore >= H && CaiScore >= H) {
                    Level1.add(stu);
                } else if (DeScore >= H) {
                    Level2.add(stu);
                } else if (DeScore >= CaiScore) {
                    Level3.add(stu);
                } else {
                    Level4.add(stu);
                }
            }
        }

        Collections.sort(Level1);
        Collections.sort(Level2);
        Collections.sort(Level3);
        Collections.sort(Level4);

        System.out.println(Level1.size() + Level2.size() + Level3.size() + Level4.size());

        for (Student stu : Level1) {
            System.out.println(stu.toString());
        }
        for (Student stu : Level2) {
            System.out.println(stu.toString());
        }
        for (Student stu : Level3) {
            System.out.println(stu.toString());
        }
        for (Student stu : Level4) {
            System.out.println(stu.toString());
        }

    }
}

class Student implements Comparable<Student> {
    int StudentNum;
    int DeScore;
    int CaiScore;
    int Total;

    public Student(int StudentNum, int DeScore, int CaiScore) {
        this.StudentNum = StudentNum;
        this.DeScore = DeScore;
        this.CaiScore = CaiScore;
        this.Total = this.DeScore + this.CaiScore;
    }

    public String toString() {
        return StudentNum + " " + DeScore + " " + CaiScore;
    }

    @Override
    public int compareTo(Student o) {
        if (this.Total != o.Total) {
            return o.Total - this.Total;
        }
        if (this.DeScore != o.DeScore) {
            return o.DeScore - this.DeScore;
        }
        return this.StudentNum - o.StudentNum;
    }
}
