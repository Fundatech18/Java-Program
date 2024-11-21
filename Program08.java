import java.util.Scanner;

class Matrix {
    private double[][] data;
    private static int rows;
    private static int cols;

    // Constructor to initialize matrix with specified dimensions
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new double[rows][cols];
    }

    public Matrix(Matrix m){
        this.rows = m.rows;
        this.cols = m.cols;
        this.data = new double[this.rows][this.cols];
    }

    // Constructor to initialize matrix with given data
    public Matrix(double[][] matrixData) {
        this.rows = matrixData.length;
        this.cols = matrixData[0].length;
        this.data = matrixData;
    }

    public Matrix transpose() {
        Matrix transposed = new Matrix(this.cols, this.rows);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                transposed.data[j][i] = this.data[i][j];
            }
        }
        return transposed;
    }

    void display() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }


    Matrix add(Matrix m2){
        Matrix x = new Matrix(m2);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                x.data[i][j] = this.data[i][j] + m2.data[i][j];
            }
        }
        return x;
    }

    static Matrix addition(Matrix m1,Matrix m2){
        return m1.add(m2);
    }
    Matrix sub(Matrix m2){
        Matrix x = new Matrix(m2);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                x.data[i][j] = this.data[i][j] - m2.data[i][j];
            }
        }
        return x;
    }

    static Matrix subtraction(Matrix m1,Matrix m2){
        return m1.sub(m2);
    }
    Matrix mul(Matrix m2){
        Matrix x = new Matrix(m2);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m2.cols; j++) {
                x.data[i][j] = 0;
                for (int k = 0; k < this.cols; k++) {
                    x.data[i][j] += this.data[i][k] * m2.data[k][j];
                }
            }
        }
        return x;
    }

    static Matrix multiplication(Matrix m1,Matrix m2){
        return m1.mul(m2);
    }

}

public class Program08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for matrix m1: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of columns for matrix m1: ");
        int cols1 = sc.nextInt();

        double[][] matrixData = new double[rows1][cols1];
        System.out.println("Enter the elements of matrix m1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrixData[i][j] = sc.nextDouble();
            }
        }
        Matrix m1 = new Matrix(matrixData);


        Matrix tran = m1.transpose();
        System.out.println("Transpose of m1:");
        tran.display();

        System.out.print("Enter the number of rows for matrix m2: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of columns for matrix m2: ");
        int cols2 = sc.nextInt();
        double[][] matrixData2 = new double[rows1][cols1];

        System.out.println("Enter the elements of matrix m2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrixData2[i][j] = sc.nextDouble();
            }
        }
        Matrix m2 = new Matrix(matrixData2);

        System.out.println("Matrix m1:");
        m1.display();

        System.out.println("Matrix m2:");
        m2.display();

        Matrix Result = Matrix.addition(m1, m2);
        System.out.println("Addition of Matrix : ");
        Result.display();

        Matrix subtractionResult = Matrix.subtraction(m1, m2);
        System.out.println("subtraction of Matrix : ");
        subtractionResult.display();

        Matrix multiplicatioResult = Matrix.multiplication(m1, m2);
        System.out.println("Multiplication of Matrix : ");
        multiplicatioResult.display();


    }


}