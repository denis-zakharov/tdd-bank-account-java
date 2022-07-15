package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {
    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        Money money = new Money(100);
        assertThat(account.deposit(money)).isEqualTo(money);
    }

    @Test
    public void withdrawAnAmountToDecreaseTheBanalce() {
        Account account = new Account(new Money(100));
        assertThat(account.withdraw(new Money(100))).isEqualTo(new Money());
    }

    @Test
    public void transferAnAmount() {
        Account acc1 = new Account(new Money(200));
        Account acc2 = new Account(new Money(100));
        Money targetTotal = acc1.trasfer(new Money(100), acc2);
        assertThat(targetTotal).isEqualTo(new Money(200));
    }
}
