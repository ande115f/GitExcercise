import java.util.Scanner;

public class P3_34
{
    public static void main(String[] args)
    {

        // Declarations
        double totalDiscount = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Discount calculator!");
        System.out.println("Please enter the total cost of your groceries:");
        double groceriesPrice = keyboard.nextDouble();

        // Primary calculations
        if (groceriesPrice < 10)
        {
            totalDiscount = 0;
        }
        else if (groceriesPrice < 10 || groceriesPrice > 60)
        {
            totalDiscount = 0.08;
        }
        else if (groceriesPrice < 60 || groceriesPrice >= 150)
        {
            totalDiscount = 0.10;
        }
        else if (groceriesPrice <= 150 || groceriesPrice >= 210)
        {
            totalDiscount = 0.12;
        }
        else if (groceriesPrice > 210)
        {
            totalDiscount = 0.14;
        }

        // Output
        if (totalDiscount == 0)
        {
            System.out.println("You're not entitled to a discount.");
        }
        else
            {
                System.out.println("You're entitled to a discount coupon of " + (totalDiscount*groceriesPrice) + "$ (That's " + (totalDiscount*100) + "% of your price!");
            }
    }
}
