import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("what is your current age?");
        int age = sc.nextInt();
        System.out.println("what age do you want to retire at?");
        int retire = sc.nextInt();

        int yearsLeft = retire - age;
        System.out.println("you have " + yearsLeft + "years left until you can retire");
        int year = 2015 + yearsLeft;
        System.out.println("it's 2015, so you can retire in " + year);

    }
}
