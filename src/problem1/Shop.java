package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList<>();
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
// *** create a new item and add it to the cart
            cart.add(new Item(itemName,itemPrice,quantity));
            // *** print the contents of the cart object using println
            System.out.println(cart);
            double totalPrice = 0;
            // print using loop and calculate the total price
            System.out.println("==== Cart contents ====");
            for(Item item : cart){
                totalPrice += item.getPrice() * item.getQuantity();
                System.out.println(item);
            }
            System.out.println("--> Total price : " + totalPrice + "$");
            System.out.println("============");

            System.out.print ("Continue shopping (y/n)? ");
            scan.nextLine();
            keepShopping = scan.nextLine();

        }
        while (keepShopping.equals("y"));
    }
}
