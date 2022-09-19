public class SalesTax {
    public static void main(String[] args) {

        double tax = .05;
        double price = 20;
        double totalTaxPrice;
        double totalPrice;

        totalTaxPrice = price * tax;
        totalPrice = totalTaxPrice + price;

        System.out.println("The price of the item is " + price);
        System.out.println("The tax of the item is " + tax);
        System.out.println("The tax price of the item is " + totalTaxPrice);
        System.out.println("The total price of the item is " + totalPrice);
    }
}
