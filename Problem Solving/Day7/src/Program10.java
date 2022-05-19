import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Q10.	Read a file and count how many lines ,space and words are there
public class Program10 {
    static int wordCount=0;
    static int spaceCount = 0;
    static int lineCount=0;
    static  String word = "";
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E://x.txt");
        BufferedReader bf = new BufferedReader(fileReader);
       List<String> list = new ArrayList<>();
        int line;


        while ((line = bf.read() )!= -1) {
            list= bf.lines().collect(Collectors.toList());
            //read will read all
        }
        System.out.println(list);
        for (String s : list) {
            wordCount += s.split(" ").length;
        }
        System.out.println("===============wordCount=================");
        System.out.println(" Word Count :: "+wordCount);
        System.out.println();


      countSpace(bf);

      bf.close();
    fileReader.close();
    }

    private static void countSpace(BufferedReader bf) throws IOException {

        String line2;
        while ((line2=bf.readLine())!=null){  //reading each line
            lineCount++;    //incrementing line count

            System.out.println(lineCount);
            word += line2;
        }
        System.out.println();
        System.out.println(); System.out.println("===============lineCount=================");
        System.out.println("lineCount  " + lineCount);

        System.out.println(word);
        int n = word.length();
        String s1 = word.replaceAll(" ", "");
        int s1length = s1.length();
        spaceCount = n-s1length;

        System.out.println();
        System.out.println("==============spaceCount=================");
        System.out.println("spaceCount  " + spaceCount);
       bf.close();
    }
}
