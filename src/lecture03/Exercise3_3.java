package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1つめの整数を入力してください");
        String s = input.nextLine();
        System.out.println("2つめの整数を入力してください");
        String t = input.nextLine();
        int num1 = Integer.parseInt(s);
        int num2 = Integer.parseInt(t);
        int num = num1+num2;
        System.out.println(num1+"+"+num2+"="+num);
    }
}
