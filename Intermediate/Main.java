public class Main {
    public static void main(String[] args) {
        long[] initialBalance = {1000, 2000, 1500};
        Bank bank = new Bank(initialBalance);

        System.out.println(bank.withdraw(1, 500));     // true
        System.out.println(bank.deposit(2, 300));      // true
        System.out.println(bank.transfer(3, 1, 700));  // true
        System.out.println(bank.transfer(3, 4, 100));  // false (invalid account)
        System.out.println(bank.withdraw(1, 2000));    // false (insufficient funds)
    }
}
