
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money amount) {
        int euros = euros() + amount.euros();
        int cents = cents() + amount.cents();
        
        return new Money(euros, cents);
    }
    
    public boolean less(Money amount) {
        if (this.euros > amount.euros) {
            return false;
        }
        
        if (this.euros == amount.euros && this.cents > amount.cents) {
            return false;
        }
        
        return true;
    }
    
    public Money minus(Money amount) {
        int euro = euros - amount.euros;
        int cent = cents - amount.cents;
        int total = (euro * 100) + cent;
        
        if (total < 0) {
            return new Money(0, 0);
        }
        
        return new Money(0, total);
        
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
