

class NegativeException extends Exception{
    NegativeException(String Message){
        super(Message);
    }
}

public class Program11 {
    public static void main(String[] args) {
        int []arguments = {1,2,-3,4,5,6};
//        int []array = new int[args.length];
//        try {
//            for (int i = 0; i < args.length; i++) {
//                array[i] = Integer.parseInt(args[i]);
//                if (array[i] < 0) {
//                    throw new NegativeException("Negative Argument : " + array[i]);
//                }
//            }
//        }catch (NegativeException e){
//            System.out.println("Caught custom exception: " + e.getMessage());
//        }


//                int[] arguments = {1, 2, -3, 4, 5, 6};

                for(int i = 0; i < arguments.length; i++) {
                    if (arguments[i] < 0) {
                        throw new RuntimeException("Negative Argument: " + arguments[i]);
                    }
                    System.out.println(arguments[i]);
                }

                // This code won't run if there's an exception
                System.out.println("This code might not run if there's an exception.");
            }

}
