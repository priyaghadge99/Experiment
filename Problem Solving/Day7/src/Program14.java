import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Q14.	Write a program to search a word from a text file.
//a.	1. If the word is found print a message that the word is found along
// with the position of the word in the file.
//b.	2. If the word is not found, print the message that the word is not found
// along with the total number of words in the file.
public class Program14 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :-- ");
//        String s = scanner.nextLine();
        String s = "Lines";
        FileReader fileReader = new FileReader("E://text1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        Stream<String> lines = bufferedReader.lines();
        if (lines.findAny().get().contains(s)) {
            System.out.println("Word Found");
            Stream<String> lines1 = bufferedReader.lines();    //we used another stream stream bcz everytime we called any method of stream its close..so we need new stream
//            System.out.println("Found = @ "+lines1.findAny().get().lastIndexOf(String.valueOf(lines)));  //string as a parameter , return primitive int
//            System.out.println(""+lines1.toArray().length);
//            System.out.println(lines1.count());
            List<String> list = lines1.collect(Collectors.toList());
            System.out.println(list.get(s.indexOf(s)));

        } else {
            System.out.println("Word Not Found ");
            System.out.println("Word Count " + wordCount(bufferedReader));
        }
        bufferedReader.close();
        fileReader.close();
    }

    private static int wordCount(BufferedReader bufferedReader) throws IOException {

        List<String> list = new ArrayList<>();
       int line ;
       while ((line= bufferedReader.read())!=-1){   //read character as a interger
           list = bufferedReader.lines().collect(Collectors.toList());
       }
        int wordCount = 0;
       for (String s: list){

           wordCount += s.split(" ").length;  //extract count

       }
//        System.out.println("Word Count = "+wordCount);

        return wordCount;
    }
}


//Line 36 logic remain