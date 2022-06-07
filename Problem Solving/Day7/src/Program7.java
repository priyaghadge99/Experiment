import javax.annotation.Generated;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//Q7.	Read 1st 2 line from file
public class Program7
{
    public static void main(String[] args) throws IOException {
//        File file = new File("E://text1.txt");
        FileReader fileReader = new FileReader("E://text.txt");
//        FileWriter fileWriter = new FileWriter("E://text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line = bufferedReader.readLine();
        String line2 = Files.readAllLines(Paths.get("E://text.txt")).get(5);

        //display the 1st line
//        System.out.println(line);
        System.out.println(line2);
        fileReader.close();
    }
}
