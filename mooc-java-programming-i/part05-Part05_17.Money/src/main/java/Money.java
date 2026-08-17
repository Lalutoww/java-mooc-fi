
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }

        if (this.euros > compared.euros) {
            return false;
        }

        if (this.cents < compared.cents) {
            return true;
        }

        return false;
    }

    public Money minus(Money decrease) {
        if (this.lessThan(decrease)) {
            return new Money(0, 0);
        }

        int euros = this.euros - decrease.euros;
        int cents = this.cents - decrease.cents;

        if (cents < 0) {
            euros--;
            cents += 100;
        }

        return new Money(euros, cents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
