package org.xpdojo.bank;

public class Account {
    private Money money = new Money();

    Money balance() {
        return money;
    }

    Money deposit(Money m) {
        money = money.add(m);
        return money;
    }

}
