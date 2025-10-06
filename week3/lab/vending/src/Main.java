public class Main {
  public static void main(String[] args) {

      // Calling the constructor with parameters
      VendingMachine vend1 = new VendingMachine(10, 10, 2.5, 1.5);
      System.out.println("The stock with milk is: " + vend1.stockWithMilk);
      System.out.println("The stock without milk is: " + vend1.stockWithoutMilk);
      System.out.println("The price with milk is: " + vend1.priceWithMilk);
      System.out.println("The price without milk is: " + vend1.priceWithoutMilk);

      // Calling the constructor with no parameters
      VendingMachine vend2 = new VendingMachine();
      System.out.println("This machine contains: " + vend2.stockWithMilk + " coffee with milk and " +
              vend2.stockWithoutMilk + " coffee without milk");

      VendingMachine vend3 = new VendingMachine(15, 10, 2.5, 1.5);
      System.out.println("The balance of vend3 is: " + vend3.balance);
      vend3.balance = 5.0;
      System.out.println("The balance of vend3 is: " + vend3.balance);
  }
}
