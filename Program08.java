import java.util.Scanner;

class Matrix{
    private double [][]matrixValue;
    private int rows,cols;

    Matrix(){

    }

    Matrix(int rows,int cols,double [][]matrixvalue){
        this.rows = rows;
        this.cols = cols;
        this.matrixValue = new double[rows][cols];
        this.matrixValue = matrixvalue;
    }

    double [][]transpose(double [][]matrix){
        return matrix;
    }

    public Matrix add(Matrix m1) throws Exception {
        return addition(this,m1);
    }

    public Matrix addition(Matrix m1,Matrix m2) throws Exception {
        Matrix m3;
        int row1 = m1.rows;
        int col1 = m1.cols;
        int row2 = m2.rows;
        int col2 = m2.cols;


        if((row1 == row2) && (col1 == col2)){
            double [][]matrix = new double[row1][col1];

            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){

                    matrix[i][j] = (m1.matrixValue[i][j] + m2.matrixValue[i][j]);
                }
            }
            m3 = new Matrix(row1,col1,matrix);

        }else{
            throw new Exception("Matrix size must be same at the time of addition");
        }

        return m3;
    }

    public Matrix sub(Matrix m1) throws Exception{
        return subtraction(this,m1);
    }

    public Matrix subtraction(Matrix m1,Matrix m2) throws Exception{
        Matrix m3;
        int row1 = m1.rows;
        int col1 = m1.cols;
        int row2 = m2.rows;
        int col2 = m2.cols;


        if((row1 == row2) && (col1 == col2)){
            double [][]matrix = new double[row1][col1];

            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){

                    matrix[i][j] = (m1.matrixValue[i][j] - m2.matrixValue[i][j]);
                }
            }
            m3 = new Matrix(row1,col1,matrix);

        }else{
            throw new Exception("Matrix size must be same at the time of subtraction");
        }

        return m3;
    }

    public Matrix mul(Matrix m1) throws Exception{
        return multiplication(this,m1);
    }

    public Matrix multiplication(Matrix m1,Matrix m2) throws Exception{
        Matrix m3;
        int row1 = m1.rows;
        int col1 = m1.cols;
        int row2 = m2.rows;
        int col2 = m2.cols;

        if(col1 == row2){
            double [][]matrix = new double[row1][col2];
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        matrix[i][j] += (m1.matrixValue[i][k] * m2.matrixValue[k][j]);
                    }
                }
            }
            m3 = new Matrix(col2,row1,matrix);
        }else{
            throw new Exception("Number of Matrix 1 cols and Number of Matrix 2 rows must be same ");
        }
        return m3;
    }

    public void print(){
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.cols;j++){
                System.out.print(this.matrixValue[i][j]+"  ");
            }
            System.out.println();
        }
    }


}

public class Program08 {
    static Matrix defineingObject(Scanner takeInput){

        int rows,cols;
        double [][]matrix;
        System.out.println("Enter the Details of Matrix");

        System.out.print("Enter the Row of Matrix :");
        rows = takeInput.nextInt();
        System.out.print("Enter the Col of Matrix : ");
        cols = takeInput.nextInt();

        matrix = new double[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.printf("Enter the value of Matrix[%d][%d] : ",i,j);
                matrix[i][j] = takeInput.nextDouble();
            }
        }

        //Object initialization
        return new Matrix(rows,cols,matrix);
    }
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.println("Enter the detail of Matrix 1 : ");
        Matrix m1 = defineingObject(takeInput);
        System.out.println("Enter the detail of Matrix 2 : ");
        Matrix m2 = defineingObject(takeInput);
        Matrix addition,subtraction,multiplication;
        addition = new Matrix();
        subtraction = new Matrix();
        multiplication = new Matrix();



        try{
            System.out.println("Addition of Matrix 1 and Matrix 2 : ");
            addition = m2.add(m1);
            addition.print();

            System.out.println("subtraction of Matrix 1  and Matrix 2 : ");
            subtraction = m2.sub(m1);
            subtraction.print();

            System.out.println("Multiplication of Matrix 1 and Matrix 2 : ");
            multiplication = m2.mul(m1);
            multiplication.print();

        }catch (Exception e){
            System.out.println("Error : "+ e.getMessage());
        }



    }
}
