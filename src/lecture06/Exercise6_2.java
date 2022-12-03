package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        for (int i = 0;i<5;i++){
            arrayList.add(random.nextInt(6)+1);
        }
        System.out.println("サイコロを5個振りました.");
        System.out.println("何番目のサイコロの値を確認しますか？");
        System.out.print(">");
        try {
            int index = input.nextInt();
            System.out.println(arrayList.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Arraylistの範囲外アクセスを確認しました。");
            System.out.print("プログラムを終了します.");
        }

    }
}
