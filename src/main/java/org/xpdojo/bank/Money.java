package org.xpdojo.bank;

import java.util.Objects;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
    private final int qty;

    public Money() {
        this.qty = 0;
    }

    public Money(int qty) {
        this.qty = qty;
    }

    int quantity() {
        return qty;
    }

    Money add(Money money) {
        return new Money(qty + money.quantity());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return qty == money.quantity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(qty);
    }
}
