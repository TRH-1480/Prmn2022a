package lecture04;

public class Excercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();

        String name = "藤井智子";
        String number = "12345";

        while (true) {
            if (!atm.existsAccount(name, number)) {
                System.out.println("名前：" + name + "さんの口座番号" + number + "は存在しません。");
                atm.registerAccount(name, number);
            } else {
                System.out.println("名前：" + name + "さんの口座番号" + number + "は存在します。");
                break;
            }
        }

        atm.deposit(number,1000);
        long a = atm.withdraw(number,2000);
        System.out.println("残高"+a+"円です。");
        a=atm.withdraw(number,500);
        System.out.println("残高"+a+"円です。");
    }
}
