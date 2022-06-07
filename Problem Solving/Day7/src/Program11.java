import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

// Q11.	Create a text file using any simple editor.
// Write a program that will reverse each line in the input file and store it in another file.


public class Program11 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileReader reader = new FileReader("E://text1.txt");
        BufferedReader bf = new BufferedReader(reader);
        FileWriter fileWriter = new FileWriter("E://text2.txt");
        int line;
        List<String> list = new ArrayList<>();
        while ((line = reader.read())!=-1){
            list= bf.lines().collect(Collectors.toList());  //on stream we can used collect
        }
        reader.close();
       StringBuffer stringBuffer = new StringBuffer(String.valueOf(list));
        String s1 = String.valueOf(list);
        System.out.println("Actual List : "+s1.toString());
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i=0;i<list.size();++i) {
            String s = list.get(i);
            bufferedWriter.write(s);
            bufferedWriter.newLine();

        }
        bf.close();
        bufferedWriter.close();
        fileWriter.close();



    }
}
