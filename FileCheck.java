import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCheck {
    public static void main(String[] args) {
        try {
            // Create a File object to check if the file exists
            File file = new File("demo.txt");

            // Check if the file exists
            if (file.exists()) {
                System.out.println("File exists.");
            } else {
                System.out.println("File does not exist. Creating file...");
            }

            // Create a FileWriter object to write to the file
            FileWriter f = new FileWriter(file);
            f.write("Hello, World!");
            f.close();

            // Create a FileReader object to read the file
            FileReader fr = new FileReader(file);

            // Read and print each character from the file
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);  // Cast the int to char to get the actual character
            }
            fr.close();  // Close the FileReader

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
