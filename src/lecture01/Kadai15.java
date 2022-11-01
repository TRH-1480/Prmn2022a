package lecture01;
import  java.util.Scanner;

public class Kadai15 {
    public static void main(String[] args) {

        int score[] = {41, 85, 72, 38, 80};


        for (int i = 0; i < 5; i++) {
            if (score[i] >= 90) {
                System.out.println(i + "番 " + score[i] + "点　　秀");
            } else if (80 <= score[i] && score[i] < 90) {
                System.out.println(i + "番 " + score[i] + "点　　優");
            } else if (70 <= score[i] && score[i] < 80) {
                System.out.println(i + "番 " + score[i] + "点　　良");
            } else if (60 <= score[i] && score[i] < 70) {
                System.out.println(i + "番 " + score[i] + "点　　可");
            } else {
                System.out.println(i + "番 " + score[i] + "点　　不可");
            }
        }

        Calculator.min(score);
        Calculator.max(score);
        Calculator.average(score);
    }

}
class Calculator{
    static   void max(int[] student) {
        int max = student[0];
        for (int i = 0; i < student.length; i++) {
            if (max < student[i]) {
                max = student[i];
            }
        }
        System.out.println("最高点 " + max + "点");
    }

    static void min(int[] student) {
        int min = student[0];
        for (int i = 0; i < student.length; i++) {
            if (min > student[i]) {
                min = student[i];
            }
        }
        System.out.println("最低点 " + min + "点");
    }

    static void average(int[] student) {
        double ave;
        int sum = 0;
        for (int i = 0; i < student.length; i++) {
            sum = sum + student[i];
        }
        ave = (double) sum / student.length;
        System.out.println("平均点 " + ave + "点");
    }
}

