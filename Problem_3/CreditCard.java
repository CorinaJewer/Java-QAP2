public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard (Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }

    public Money getBalance(){
        return balance;
    }

    public Money getCreditLimit(){
        return creditLimit;
    }

    // toString() method from Person class
    
    public String getPersonals(){
           return owner.toString();
    }

    // add() method from Money class

    public void charge(Money amount){
        Money newBalance = balance.add(amount);

        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Charge exceeds credit limit.");
        }         
    }

    // subtract() method from Money class

    public void payment(Money amount){
        balance = balance.subtract(amount);
    }
   
}
