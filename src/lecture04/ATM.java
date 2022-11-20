package lecture04;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    private List<Account> accountList;

    public ATM(){
        accountList = new ArrayList<>();
    }

    public void registerAccount(String name,String number){
        accountList.add(new Account(name,number));
        System.out.println("名前:"+name+"さんのアカウントを口座番号"+number+"で登録しました。");
    }

    public  boolean existsAccount(String name,String number) {
        for (Account account1 : accountList) {
            if (name.equals(account1.getName()) && number.equals(account1.getNumber())) {
                return true;
            }
        }
        return  false;
    }

    public void deposit(String number,long money){
        for(Account account1 : accountList){
            if(number.equals(account1.getNumber())){
                System.out.println("口座番号"+number+"に"+money+"円入金しました。");
                account1.setBalance(money);
            }
        }
    }

    public long withdraw(String number,long money){
        for(Account account1 : accountList){
            if(number.equals(account1.getNumber()) ){
                long money1 = account1.getBalance();
                if(money1<money){
                    System.out.print("口座番号"+number+"に"+money+"円引き出せませんでした。");
                    return money1;
                }else{
                    System.out.print("口座番号"+number+"に"+money+"円引き出しました。");
                    return (money1-money);
                }
            }
        }
        return 0;
    }

}
