package lr2;

import java.math.BigDecimal;

public class Task7 {

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.deposit(BigDecimal.valueOf(500));
        bank.withdrawal(BigDecimal.valueOf(400));
        bank.withdrawal(BigDecimal.valueOf(50));

        System.out.println("Текущий баланс %s".formatted(bank.getBalance()));
    }
}

class Bank implements BankOperation {
    private BigDecimal balance = BigDecimal.ZERO;

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void withdrawal(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
        } else {
            System.out.println("Недостаточно средств!");
        }
    }
}

interface BankOperation {

    void deposit(BigDecimal amount);

    void withdrawal(BigDecimal amount);
}