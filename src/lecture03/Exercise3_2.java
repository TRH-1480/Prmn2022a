package lecture03;

import javax.swing.text.AbstractDocument;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("何行分入力しますか？");
        int s = input.nextInt();

        for(int i=1;i<=s;i++) {
            System.out.println(i+"行目:");
            String r = input.next();
            list.add(r);
        }

        System.out.println("入力した文字列:");

        for(String content:list){
            System.out.println("["+list.indexOf(content)+"]"+content);
        }
    }
}
