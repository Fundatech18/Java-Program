///*
//Create a class Stack with all necessary constructors and implement all the necessary methods of stack like:
//1) public void push(int value)
//2) public int pop()
//3) public void traverse() etc.
//*/
//
//import java.util.Scanner;
//import java.util.InputMismatchException;
//
//class Stack{
//    int []array;
//     int top;
//
//    Stack(int limit){
//        this.array = new int[limit];
//        this.top = -1;
//    }
//
//    public void  push(int value){
//        this.top++;
//        this.array[this.top] = value;
//    }
//
//    public int pop(){
//        int value = this.array[this.top];
//        this.top--;
//        return value;
//    }
//
//    public int peek(){
//        return array[this.top];
//    }
//
//    public void traverse(){
//        for(int i = 0;i <= this.top;i++){
//            System.out.print(this.array[i] + "  ");
//        }
//    }
//
//
//}
//
//public class Program07 {
//    public static void main(String[] args) {
//        Scanner takeInput = new Scanner(System.in);
//
//        int limit,choice;
//        try{
//        System.out.print("Enter the limit of array : ");
//        limit = takeInput.nextInt();
//
////      create object
//        Stack s = new Stack(limit);
//
//        while (true) {
//
//            System.out.println("Enter 1 for push");
//            System.out.println("Enter 2 for pop");
//            System.out.println("Enter 3 for peep");
//            System.out.println("Enter 4 for traverse");
//
//            System.out.print("Enter Your choice : ");
//
//            choice = takeInput.nextInt();
//
//                switch (choice) {
//                    case 1:
//                        if (s.top == limit - 1) {
//                            System.out.println("Stack is overflow");
//                        } else {
//                            System.out.print("Enter the element : ");
//                            int element = takeInput.nextInt();
//                            s.push(element);
//                        }
//                        break;
//
//                    case 2:
//                        if (s.top == -1) {
//                            System.out.println("Stack is underflow");
//                        } else {
//                            int element = s.pop();
//                            System.out.println(element + " is deleted ");
//                        }
//                        break;
//
//                    case 3:
//                        if (s.top == -1) {
//                            System.out.println("No Element available");
//                        } else {
//                            System.out.println("Peek element is - " + s.peek());
//                        }
//                        break;
//
//                    case 4:
//                        if (s.top == -1) {
//                            System.out.println("Stack is underflow");
//                        } else {
//                            System.out.print("Stack Elements  -  ");
//                            s.traverse();
//                            System.out.println();
//                        }
//                        break;
//
//                    default:
//                        System.out.println("Please enter valid choice");
//                        break;
//                }
//        }
//            }catch (InputMismatchException e){
//                System.out.println("Please chock the value");
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid choice. Please enter an integer.");
//            } catch (Exception e){
//                System.out.println("Error : "+e.getMessage());
//            }
//
//    }
//}
