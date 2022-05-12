import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

//Q8.	Print 10 line in a file then ask user which line it wants to read accordingly display that line
public class Program8 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\text.txt"));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\text.txt"));
        try {
            bufferedWriter.write("Writing in a file:- ");
            bufferedWriter.newLine();
            for (int i = 0; i < 10; i++) {
                bufferedWriter.write("Line by Line printing  " + i + " value");
                bufferedWriter.newLine();
                System.out.println("buffer Writer");
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter line you wanna read");
            int i = scanner.nextInt();
//            while ((line = bufferedReader.readLine()) != null) {
                // process the line
                String line2 = Files.readAllLines(Paths.get("E://text.txt")).get(i);
                String readLine = bufferedReader.readLine();
                System.out.println(readLine);
                System.out.println(line2);
           // }
        } finally {
            bufferedWriter.close();
            bufferedReader.close();

        }
    }
}

   // BufferedReader br = new BufferedReader(new FileReader(file));


//how to take input from user n then print