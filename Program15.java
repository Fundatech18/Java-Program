import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Program15 {

    public static void dataExceutions(String[] receivedData){
        float totalMarks = Integer.parseInt(receivedData[2]) + Integer.parseInt(receivedData[3]) + Integer.parseInt(receivedData[4]);
        float percentage = totalMarks / 3;
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-12s %.2f%n", receivedData[0], receivedData[1], receivedData[2], receivedData[3],receivedData[4],
                totalMarks, percentage);
    }

    public static void readData(String src){
        String line;
        try{
            FileReader fr = new FileReader(src);
            BufferedReader br = new BufferedReader(fr);
            while( (line = br.readLine())!= null){
                String []receivedData = line.split("\t");
                dataExceutions(receivedData);
            }
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String fileName = "src/file.text";
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-12s %s%n", "Roll No", "Name", "Sub1", "Sub2", "Sub3",
                "Total", "Percentage");
        readData(fileName);
    }
}
