package exercises;

import java.util.Scanner;

public class MPGCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many miles have you driven?: ");
        float  miles = in.nextFloat();
        System.out.println("How much gas have you used (in gallons)?: ");
        float  gallons = in.nextFloat();

        float mpg = miles / gallons;

        System.out.println("Your MPG is: " + mpg );
    }
}
