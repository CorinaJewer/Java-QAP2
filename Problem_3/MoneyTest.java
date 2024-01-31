public class MoneyTest {
        public static void main(String[] args) {

            System.out.println();

            // Objects
            Money money1 = new Money(12.349);
            System.out.println("Money1: " + money1);

            Money money2 = new Money(money1);
            System.out.println("Money2: (copy of Money1): " + money2);

            Money money3 = new Money(125.25);
            System.out.println("Money3: " + money3);
    
            // add() method
            Money totalBalMoney = money1.add(money2);
            System.out.println("Money1 + Money2: " + totalBalMoney);
    
            // subtract() method
            Money remainingBalMoney = money3.subtract(money2);
            System.out.println("Money3 - Money2: " + remainingBalMoney);
    
            // compareTo() method
            int stringCompare = money1.compareTo(money3);
            System.out.println("Compare (Money1 vs. Money3) lexicographically: " + stringCompare);
    
            // equals() method
            boolean isEqual = money1.equals(money2);
            System.out.println("Are Money1 and Money2 equal lexicographically? " + isEqual);

            System.out.println();
        }
    }
    

