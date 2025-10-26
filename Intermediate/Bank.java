public class Bank {
    long[] balance;
    Bank(long[] balance){
        this.balance = balance;
    }

    public boolean isValidAccount(int Account){
        return Account >= 1 && Account <= balance.length;
    }

    public boolean transfer(int Account1, int Account2 , long money){
        if(!isValidAccount(Account1) || !isValidAccount(Account2)) return false;

        if(balance[Account1-1] < money) return false;

        balance[Account1-1] -= money;
        balance[Account2-1] += money;
        return true;
    }

    public boolean deposit(int Account , long money){
        if(!isValidAccount(Account)) return false;

        balance[Account-1] += money;
        return true;
    }

    public boolean withdraw(int Account , long money){
        if(!isValidAccount(Account)) return false;
        if(balance[Account-1]<money) return false;

        balance[Account-1] -= money;
        return true;
    }

}