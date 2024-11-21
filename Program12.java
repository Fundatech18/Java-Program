import java.util.Scanner;

class StackException extends Exception{
    StackException(String msg){
        super(msg);
    }
}

class Stack{
    int []array;
    int top;
    int size;

    Stack(int size){
        this.array = new int[size];
        this.size = size;
        this.top = -1;
    }

    boolean push(int element){
        try{
            if(this.top == this.size-1){
                throw new StackException("Stack is overflow");
            }else{
                this.top++;
                this.array[top] = element;
                return true;
            }
        }catch (StackException e){
            System.out.println("Error : " + e.getMessage());
        }
        return false;
    }

    boolean pop(){
        try{
            if(this.top == -1){
                throw new StackException("Stack is underflow");
            }else{
                this.array[top] = 0;
                this.top--;
                return true;
            }
        }catch (StackException e){
            System.out.println("Error : " + e.getMessage());
        }
        return false;
    }

    int peek(){
        try {
            if(this.top == -1){
                throw new StackException("No Element is Available in stack");
            }else{
                return this.array[this.top];
            }
        }catch (StackException e){
            System.out.println("Error : " + e.getMessage());
        }
        return -1;
    }

    void traverse(){
        try {
            if(this.top == -1){
                throw new StackException("No Element is Available in stack");
            }else{
                for(int i=0;i<=this.top;i++){
                    System.out.print(this.array[i] + "  ");
                }
                System.out.println();
            }
        }catch (StackException e){
            System.out.println("Error : " + e.getMessage());
        }
    }


}

public class Program12 {
    public static void main(String[] args) {
        Scanner takeInout = new Scanner(System.in);
        int choice,element,size;
        System.out.print("Enter the size of Array : ");
        size = takeInout.nextInt();
        Stack stack = new Stack(size);
        boolean returnedValue;

        while(true){
            System.out.println("1. push element");
            System.out.println("2. pop elemenet");
            System.out.println("3. peep element");
            System.out.println("4. Traverse ");
            System.out.print("Enter Choice : ");
            choice = takeInout.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter the Element : ");
                    element = takeInout.nextInt();
                    returnedValue = stack.push(element);
                    if(returnedValue){
                        System.out.println("Element inserted successfully");
                    }else{
                        System.out.println("Failed to Insert element");
                    }
                    break;

                case 2:
                    returnedValue = stack.pop();
                    if(returnedValue){
                        System.out.println("Element Removed successfully");
                    }else{
                        System.out.println("Failed to Remove element");
                    }
                    break;

                case 3:
                    int topElement = stack.peek();
                    if(topElement == -1){
                        System.out.println("No Element is Available in stack");
                    }else{
                        System.out.println(topElement + " is found on top");
                    }
                    break;

                case 4:
                    System.out.print("Traversel : ");
                    stack.traverse();
                    break;
            }
        }
    }
}
