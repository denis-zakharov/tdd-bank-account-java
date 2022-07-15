package org.xpdojo.bank;

public class Account {
    private Money money;

    public Account() {
        this.money = new Money();
    }

    public Account(Money money) {
        this.money = money;
    }

    Money balance() {
        return money;
    }

    Money deposit(Money m) {
        money = money.add(m);
        return money;
    }

    public Money withdraw(Money m) {
        money = money.add(m.negate());
        return money;
    }

    public Money trasfer(Money m, Account target) {
        return target.balance();
    }
}
