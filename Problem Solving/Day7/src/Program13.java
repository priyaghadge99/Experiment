
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


////Q13.	Write a program that will read each line in a file and store it in another file with the sequence reversed, that is,
//// the first line in file one should be the last line in file two and so on.
public class Program13 {
    public static String s;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileReader reader = new FileReader("E://text1.txt");
        BufferedReader bf = new BufferedReader(reader);
        FileWriter fileWriter = new FileWriter("E://text2.txt");
        int line;
        List<String> list = new ArrayList<>();
       while ((line = reader.read())!= -1){
         list= bf.lines().collect(Collectors.toList());
           System.out.println(list);
        }
       reader.close();
       BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        int size = list.size();
        for (int i=size;i>-1;i--)
        {
            try {
                 s = list.get(i);
                bufferedWriter.write(s);   //nextline feature is in bf that why took bufferwriter
                bufferedWriter.newLine();
            }
            catch (Exception e)
            {
                e.getMessage();
            }
        }
        bufferedWriter.close();  //do not close stream first ..if its close exception (Stream close)
        fileWriter.close();

    }
}

