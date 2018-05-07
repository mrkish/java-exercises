package exercises;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the rectangle's width?: ");
        float  width = in.nextFloat();
        System.out.println("What is the rectangle's height?: ");
        float  height = in.nextFloat();

        float area = width * height;
        System.out.println("The rectangle's area is: " + area);
    }
}
