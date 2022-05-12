import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

//Q4.	Accept 5 line from user and print it in a file
public class Program4 {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Line to Print in Files");

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        String s4 = scanner.nextLine();
        String s5 = scanner.nextLine();

        File file = new File("E:\\text.txt");

        FileWriter writer = new FileWriter("E:\\text.txt");
        writer.write(s1);
        writer.write(s2);
        writer.write(s3);
        writer.write(s4);
        writer.write(s5);

        writer.close();   //should end the writer

     /*   try {
            FileWriter Writer
                    = new FileWriter("E:\\text.txt");
            Writer.write(
                    "Files in Java are seriously good!!");
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
    }*/
    }
}
