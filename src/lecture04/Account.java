package lecture04;

public class Account {
    private String name;
    private String number;
    private long balance;

    public Account(String name,String number){
        this.balance = 0;
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return  number;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public  long getBalance(){
        return balance;
    }
}
