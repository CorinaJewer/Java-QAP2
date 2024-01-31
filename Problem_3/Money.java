public class Money {
    
    private long dollars;
    private long cents;

    public Money(double amount){
        this.dollars = (long) amount; 
        // converts the amount to whole number for the dollars portion.
        this.cents = Math.round((amount - this.dollars) * 100); 
        //subtracts the dollars from the amount to get the fractional part, multiplies by 100 to convert it to cents, and then rounds to the nearest whole number.
    }

    public Money (Money otherObject){          // Copy Constructor
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount){
        long totalDollars = this.dollars + otherAmount.dollars;
        long totalCents = this.cents + otherAmount.cents;

        return new Money(totalDollars + (double) totalCents / 100);
    }

    public Money subtract(Money otherAmount){
        long remainingDollars = this.dollars - otherAmount.dollars;
        long remainingCents = this.cents - otherAmount.cents;

        return new Money(remainingDollars + (double) remainingCents /100);
    }

    // Long.compare method returns an int value indicating the numerical relationship between the two long values. If x < y, retunns -ve. If x > y, return +ve. If x = y, returns 0. 

    public int compareTo(Money otherObject){ 
        if (this.dollars != otherObject.dollars) {
            return Long.compare(this.dollars, otherObject.dollars);
        } else {
            return Long.compare(this.cents, otherObject.cents);
        }
    }
    
    public boolean equals(Money otherObject){
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return String.format("$%d.%02d", this.dollars, this.cents);
    }
}
