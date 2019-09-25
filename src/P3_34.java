import java.util.Scanner;

public class P3_34
{
    public static void main(String[] args)
    {

        double totalDiscount = -1;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Discount calculator!");
        System.out.println("Please enter the total cost of your groceries:");
        double groceriesPrice = keyboard.nextDouble();

        if (groceriesPrice > 10) {
            totalDiscount = 0;
        } else if (groceriesPrice < 10 && groceriesPrice > 60){
            totalDiscount = 0.08;
        } else if ()


        System.out.println("You're entitled to a discount coupon of " + totalDiscount + "%");

    }
}
