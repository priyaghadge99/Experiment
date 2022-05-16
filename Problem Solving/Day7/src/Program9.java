
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


//Q9.	Read a file and copy it in reversing order in to another file
public class Program9 {
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
        }
       reader.close();
       BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        int size = list.size();
        for (int i=size;i>0;i--)
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

