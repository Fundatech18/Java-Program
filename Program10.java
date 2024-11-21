/*
Write a java program to create an interface named Shape that contains methods
named area() and perimeter(). Provide three classes named Rectangle, Triangle and
Circle such that each one of the classes implements the interface Shape. Each one of
the classes contains all possible constructor(s) and overridden method area() and
perimeter() that calculate and return area and perimeter of the given shape
*/

import java.util.Scanner;
import java.lang.Math;

interface Shape{
    double area();
    double perimeter();
}

class Rectangle implements Shape{
    double width,height;

    Rectangle(){
        this.width = 5;
        this.height = 4;
    }
    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double area(){
        return this.width * this.height;
    }

    public double perimeter(){
        return  2 * (this.width + this.height);
    }
}

class Triangle implements Shape{
    double sideA,sideB,sideC;

    Triangle(){
        this.sideA = 3;
        this.sideB = 4;
        this.sideC = 5;
    }

    Triangle(double sideA,double sideB,double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double area(){
        return this.sideA + this.sideB + this.sideC;
    }

    public double perimeter(){
        return  this.sideA+this.sideB+this.sideC;
    }
}

class Circle implements Shape{

    double r;

    Circle(){
        this.r = 3.5;
    }

    Circle(double r){
        this.r = r;
    }

    public double area(){
        return Math.PI * this.r * this.r;
    }

    public double perimeter(){
        return  2 * Math.PI * this.r;
    }
}

public class Program10 {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,5);
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5,6,5);
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.6);
        int choice;


        while (true) {
            System.out.println("\n1:Find Area and Perimeter of Rectangle:");
            System.out.println("2:Find Area and Perimeter of Triangle:");
            System.out.println("3:Find Area and circumference of Circle:");
            System.out.println("4:exit");
            System.out.print("Enetr your choice - ");
            choice = takeInput.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("Detail of Rectangle");
                    System.out.println("Default constructor  - ");
                    System.out.println("Area of Rectangle : "+ r1.area());
                    System.out.println("Perimeter of Rectangle : "+ r1.perimeter());
                    System.out.println("Parameterized Value - ");
                    System.out.println("Area of Rectangle : "+ r2.area());
                    System.out.println("Perimeter of Rectangle : "+ r2.perimeter());
                    break;
                case 2:
                    System.out.println("Detail of Triangle");
                    System.out.println("Default constructor  - ");
                    System.out.println("Area of Triangle : "+ t1.area());
                    System.out.println("Perimeter of Triangle : "+ t1.perimeter());
                    System.out.println("Parameterized Value - ");
                    System.out.println("Area of Triangle : "+ t2.area());
                    System.out.println("Perimeter of Triangle : "+ t2.perimeter());
                    break;
                case 3:
                    System.out.println("Detail of Circle");
                    System.out.println("Default constructor  - ");
                    System.out.println("Area of Circle : "+ c1.area());
                    System.out.println("circumference of Circle : "+ c1.perimeter());
                    System.out.println("Parameterized Value - ");
                    System.out.println("Area of Circle : "+ c2.area());
                    System.out.println("circumference of Circle : "+ c2.perimeter());
                    break;

                case 4:
                    System.exit(1);

                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }
    }
}
