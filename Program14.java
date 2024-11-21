import java.io.*;


public class Program14 {

    public static void useTextMode(String sourceFileName,String destinationFileName){
        try {
            FileReader fr = new FileReader(sourceFileName);
            FileWriter fw = new FileWriter(destinationFileName);
            int data;
            while((data = fr.read()) != -1){
                fw.write(data);
            }
            fr.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void useBinaryMode(String sourceFileName,String destinationFileName){
        try{
            FileInputStream fis = new FileInputStream(sourceFileName);
            FileOutputStream fos = new FileOutputStream(destinationFileName);
            int data;
            while((data = fis.read()) != -1){
                fos.write(data);
            }

            fos.close();
            fis.close();
        }catch (IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String sourceFileName = "src/Text.text";
        String destinationFileName = "src/Text2.text";
        String mode = "binary";

        try {
            if (mode.equals("text")) {
                useTextMode(sourceFileName,destinationFileName);
            } else if (mode.equals("binary")) {
                useBinaryMode(sourceFileName,destinationFileName);
            }else {
                System.out.println("Enter Valid Mode");
            }
            System.out.println("File Copy successfully");
        }catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
