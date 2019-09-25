import java.util.Scanner;

public class P3_33 {
    public static void main(String[] args) {

        //Declaration

        int satisfaction = 0;
        double costOfMeal = 44.99;
        double costWithTip = 0;

        System.out.println("Price without Tip:_____________________________ " + costOfMeal);
        System.out.println("_________________________________________________________");
        System.out.println("1 = Totally satisfied | 2 = Satisfied | 3 = Dissatisfied");
        System.out.println("Please enter your Satisfaction Level: ");

        Scanner sc = new Scanner(System.in);
        satisfaction = sc.nextInt();

        if (satisfaction == 1);
            costWithTip = costOfMeal * 1.20;

            if (satisfaction == 2);
            costWithTip = costOfMeal * 1.15;

            if (satisfaction == 3);
            costWithTip = costOfMeal * 1.10;

        System.out.printf("Your price with a tip according to your satisfaction would be %.2", + costWithTip);

        }
    }

