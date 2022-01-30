package org.launchcode.java.studios.areaofacircle;
import org.launchcode.java.studios.areaofacircle.Circle;
import java.util.Scanner;
import java.lang.Math.*;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a circle radius: ");
        double radius = input.nextDouble();
        Double area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area + ".");
    }
}
