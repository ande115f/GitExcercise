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

        //calculation of pay
        double payOvertimerWork = 0;
        double pay = hourlyWage * workHours;
        if (workHours > 40) {
            double payOvertimeWork = (workHours - 40) * (1.5 * hourlyWage);
        }



        double payTotal = pay + payOvertimerWork;


    }
}
