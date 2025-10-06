public class VendingMachine {

    public int stockWithMilk;
    public int stockWithoutMilk;
    public double priceWithMilk;
    public double priceWithoutMilk;
    public double balance;

    public VendingMachine(int stockWithMilk, int stockWithoutMilk,
                          double priceWithMilk, double priceWithoutMilk) {
        this.stockWithMilk = stockWithMilk;
        this.stockWithoutMilk = stockWithoutMilk;
        this.priceWithMilk = priceWithMilk;
        this.priceWithoutMilk = priceWithoutMilk;
        this.balance = 0.0;
    }

    public VendingMachine() {
        this(0, 0, 0.0, 0.0);
    }

}
