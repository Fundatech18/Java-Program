//// create an abstract class named Shape that contains two integers and abstract methods named area() and perimeter(). Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class
//// 1) public double area() that calculate and return area of the given shape. And
//// 2) public double perimeter() that calculates and returns circumference/perimeter
//// of the given shape.
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//abstract class Shape{
//     int dimension1;
//     int dimension2;
//
//    abstract public double area();
//    abstract public double perimeter();
//}
//
//class Rectangle extends Shape{
//    double width,height;
//
//    Rectangle(){
//        this.width = 3.5;
//        this.height = 3.5;
//    }
//
//    Rectangle(double width,double height){
//        this.width = width;
//        this.height = height;
//    }
//
//    public double area(){
//        return this.width * this.height;
//    }
//
//    public double perimeter(){
//        return 2*(this.width + this.height);
//    }
//}
//
//class Triangle extends Shape{
//    double sideA,sideB,sideC;
//    Triangle(){
//        this.sideA = 4.5;
//        this.sideB = 4.5;
//        this.sideC = 4;
//    }
//
//    Triangle(double sideA,double sideB,double sideC){
//        this.sideA = sideA;
//        this.sideB = sideB;
//        this.sideC = sideC;
//    }
//
//    public double area(){
//        return this.sideA*this.sideB*this.sideC;
//    }
//
//    public double perimeter(){
//        return this.sideA+this.sideB+this.sideC;
//    }
//}
//
//class Circelx extends Shape{
//    double r;
//    Circelx(){
//       this.r = 3.5;
//    }
//
//    Circelx(double r){
//        this.r = r;
//    }
//
//    public double area(){
//        return Math.PI * this.r * this.r;
//    }
//
//    public double perimeter(){
//        return 2 * Math.PI * this.r;
//    }
//}
//
//
//public class Program09 {
//    public static void main(String[] args) {
//
//        Scanner takeInput = new Scanner(System.in);
//        Rectangle r1 = new Rectangle();
//        Rectangle r2 = new Rectangle(5,5);
//        Triangle t1 = new Triangle();
//        Triangle t2 = new Triangle(5,5,6);
//        Circelx c1 = new Circelx();
//        Circelx c2 = new Circelx(5.6);
//        int choice;
//
//        try {
//            while (true) {
//                System.out.println("\n1:Find Area and Perimeter of Rectangle:");
//                System.out.println("2:Find Area and Perimeter of Triangle:");
//                System.out.println("3:Find Area and circumference of Circle:");
//                System.out.println("4:exit");
//                System.out.print("Enter your choice - ");
//                choice = takeInput.nextInt();
//
//                switch (choice) {
//                    case 1:
//                        System.out.println("Detail of Rectangle");
//                        System.out.println("Default constructor  - ");
//                        System.out.println("Area of Rectangle : " + r1.area());
//                        System.out.println("Perimeter of Rectangle : " + r1.perimeter());
//                        System.out.println("Parameterized Value - ");
//                        System.out.println("Area of Rectangle : " + r2.area());
//                        System.out.println("Perimeter of Rectangle : " + r2.perimeter());
//                        break;
//                    case 2:
//                        System.out.println("Detail of Triangle");
//                        System.out.println("Default constructor  - ");
//                        System.out.println("Area of Triangle : " + t1.area());
//                        System.out.println("Perimeter of Triangle : " + t1.perimeter());
//                        System.out.println("Parameterized Value - ");
//                        System.out.println("Area of Triangle : " + t2.area());
//                        System.out.println("Perimeter of Triangle : " + t2.perimeter());
//                        break;
//                    case 3:
//                        System.out.println("Detail of Circle");
//                        System.out.println("Default constructor  - ");
//                        System.out.println("Area of Circle : " + c1.area());
//                        System.out.println("circumference of Circle : " + c1.perimeter());
//                        System.out.println("Parameterized Value - ");
//                        System.out.println("Area of Circle : " + c2.area());
//                        System.out.println("circumference of Circle : " + c2.perimeter());
//                        break;
//
//                    case 4:
//                        System.exit(1);
//
//                    default:
//                        System.out.println("Enter valid choice");
//                        break;
//                }
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Error : Invalid choice");
//        }
// 
//    }
//
//}