///* Create a class “Circle” with
//1) private variables x, y, and r
//Here x and y are coordinates of center of circle and r is a radius
//2) Define all possible constructors.
//3) Define a method – public double area() which is calculate and return area of a
//circle.
//4) Define a method – public double circumference() which is calculate and return
//perimeter of a circle.
//5) Define a method – public double diameter() which is calculate and return
//diameter of a circle */
//
//import java.util.Scanner;
//
//class Circle {
//    private double x;
//    private double y;
//    private double r;
//
//    Circle() {
//        this.x = 2.5;
//        this.y = 3.5;
//        this.r = 2.3;
//    }
//
//    Circle(double x, double y, double r) {
//        this.x = x;
//        this.y = y;
//        this.r = r;
//    }
//
//    public double area() {
//        double areaOfCircle = Math.PI * this.r * this.r;
//        return areaOfCircle;
//    }
//
//    public double circumference() {
//        double circumferenceOfCircle = 2 * Math.PI * this.r;
//        return circumferenceOfCircle;
//    }
//
//    public double diameter() {
//        double diameterOfCircle = 2 * this.r;
//        return diameterOfCircle;
//    }
//
//    double getX(){
//        return this.x;
//    }
//
//    double getY(){
//        return this.y;
//    }
//
//    double getR(){
//        return this.r;
//    }
//
//}
//
//public class Program06 {
//    public static void main(String[] args) {
//
//        // Scanner Class
//        Scanner takeInput = new Scanner(System.in);
//
//        System.out.println("Find the Area of Circle,Circumfernce,Diameter");
//        while (true) {
//
//            try {
//                int choice;
//                System.out.println("Enter 1 for Default Value : ");
//                System.out.println("Enter 2 for User Input : ");
//                System.out.print("Enter Choice : ");
//                choice = takeInput.nextInt();
//                switch (choice) {
//                    case 1:
//                        Circle c1 = new Circle();
//                        System.out.println("Value of X coordinates : "+ c1.getX());
//                        System.out.println("Value of Y coordinates : "+c1.getY());
//                        System.out.println("Value of Radius : "+c1.getR());
//                        System.out.println("Area of Circle : " + c1.area());
//                        System.out.println("Circumfernce of Circle : " + c1.circumference());
//                        System.out.println("Diameter of Circle : " + c1.diameter());
//                        break;
//
//                    case 2:
//                        try {
//                            double x, y, r;
//                            System.out.print("Enter the X coordinate :  ");
//                            x = takeInput.nextDouble();
//
//                            System.out.print("Enter the Y coordinate : ");
//                            y = takeInput.nextDouble();
//
//                            System.out.print("Enter the Radius : ");
//                            r = takeInput.nextDouble();
//
//                            Circle c2 = new Circle(x, y, r);
//                            System.out.println("Value of X coordinates : "+ c2.getX());
//                            System.out.println("Value of Y coordinates : "+c2.getY());
//                            System.out.println("Value of Radius : "+c2.getR());
//                            System.out.println("Area of Circle : " + c2.area());
//                            System.out.println("Circumfernce of Circle : " + c2.circumference());
//                            System.out.println("Diameter of Circle : " + c2.diameter());
//                        } catch (Exception e) {
//                            System.out.println("Error : " + e.getMessage());
//                        }
//
//                    default:
//                        break;
//                }
//            } catch (Exception e) {
//                System.out.println("Error : " + e.getMessage());
//            }
//        }
//
//    }
//}