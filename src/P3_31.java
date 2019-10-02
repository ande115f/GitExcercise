//Exercise P3.31 p131.
import java.util.Scanner;

public class P3_31 {
    public static void main(String[] args) {

        //ask user for input
        Scanner in = new Scanner(System.in);
        System.out.print("Please input your Name: ");
        String name = in.next();
        System.out.print("Please input your salary as an hourly wage: ");
        double hourlyWage = in.nextDouble();
        System.out.print("Please input workhours for the week: ");
        double workHours = in.nextDouble();

        //calculation of pay and overtimework
        double payOvertimeWork = 0;
        double pay;

        if (workHours > 40) {
            payOvertimeWork = (workHours - 40) * (1.5 * hourlyWage);
            pay = hourlyWage * 40;
        }
        else {
            pay = hourlyWage * workHours;
        }

        double payTotal = pay + payOvertimeWork;

        //output paycheck
        System.out.println("------------------------------------");
        System.out.println("Paycheck for: "+name);
        System.out.println("Hourly wage: "+hourlyWage+ " Euro");
        //System.out.println("Workhours for the week: "+workHours+" hours");
        System.out.printf("Workhours for the week: %.2f", + workHours, " hours");
        System.out.print("\nPaycheck for the week in Euro: ");
        System.out.printf("%.2f",payTotal);
    }
}
