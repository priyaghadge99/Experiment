import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Q15.	A user requires to do the following operations:
//1.Number the lines in a file
//2.Displayn lines from a given line number.
//3. Delete a particular line
//4. Search for a given word and print all the lines where the word is found
public class Program15 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                " 1.Number the lines in a file\n" +
                "2.Displayn lines from a given line number.\n" +
                "3. Delete a particular line\n" +
                "4. Search for a given word and print all the lines where the word is found");
        System.out.println("Enter choice ");
        char choice = scanner.next().charAt(0);
        char ch = choice;
//        while (choice<5){
            switch (ch) {
                case '1':

                    addLineNumbers();
                    break;

                case '2':
                    System.out.println("Enter line");
                    int i = scanner.nextInt();
                    displayLine(i);
                    System.out.println("==============");
                    break;


                case '3':
                    System.out.println("Enter which line you wanna delete");
                    int i1 = scanner.nextInt();
                    deleteLine(i1);
                    break;

                case '4':
                    System.out.println("Search word print lines where word present : ");
                    String word = scanner.next();

                    wordpresentLine(word);
                    System.out.println("================");
                    break;

                default:
                    System.out.println("Please enter correct choice :");
                    System.out.println("Do you want to contine");


            }
//            char c = scanner.next().charAt(0);
//            if (c == 'y' || c == 'Y')
            System.out.println("Enter choice");
            choice = scanner.next().charAt(0);


//        }
    }

    private static void wordpresentLine(String word) throws IOException {

        FileReader fileReader = new FileReader("E://text//text.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int line;
        List<String> list = new ArrayList<>();
   /*     while ((line = bufferedReader.read()) != -1) {
            list = bufferedReader.lines().collect(Collectors.toList());
            if (list.contains("Line")){
                System.out.println(bufferedReader.readLine());
            }

        }

        Iterator<String> stringIterator = list.stream().iterator();
        while (stringIterator.hasNext()){
            System.out.println(" "+stringIterator.next());
//            if (stringIterator.next() .contains(word)) {
//                System.out.println(stringIterator.next());
//            }
        }
*/
       String lines;
        while ((lines = bufferedReader.readLine())!=null){

           try {
               if (lines.contains(word)){

                   System.out.println(lines);
               }
           }
           catch ( Exception e){
               e.getMessage();
           }
        }
//        System.out.println( "sout "+list.listIterator().next().contains(word));
//        System.out.println();

        bufferedReader.close();
        fileReader.close();


    }

    private static void deleteLine(int i1) throws IOException {
        FileReader fileReader = new FileReader("E://text//text.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int lineNum = 0;
        while ((line = bufferedReader.readLine()) != null) {
            String[] s = line.split(" ");
//            System.out.println("Line numbers " +lineNum);
//            System.out.println(line);
            lineNum++;
            if (lineNum==i1){
                System.out.println(line);
                String lines = bufferedReader.readLine();
                line.replace("lines","");
            }
            else {
//                System.out.println("Not Present");
            }

        }


        //convert list of string into integer
        bufferedReader.close();
        fileReader.close();

    }

    private static void displayLine(int i) throws IOException {

        FileReader fileReader = new FileReader("E://text//text.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int line;
        List<String> list = new ArrayList<>();
        while ((line = bufferedReader.read()) != -1) {
            list = bufferedReader.lines().collect(Collectors.toList());


        }
        System.out.println(list);
        System.out.println("==========================================");
        System.out.println("Line at index " + i + " \n" + list.get(i));
        String readLine;
        while ((readLine = bufferedReader.readLine()) != null){
        System.out.println(readLine);
    }

        bufferedReader.close();
        fileReader.close();
    }

    private static void addLineNumbers() throws IOException {

        FileReader fileReader = new FileReader("E://text.txt");
        BufferedReader bf = new BufferedReader(fileReader);
        PrintWriter printWriter = new PrintWriter("E://text//text.txt");
        String line;
        int ctr = 0;
        while ((line = bf.readLine()) != null) {

            ctr++;
            printWriter.println(ctr + ". " + line);
            System.out.println(ctr + "." +line);


        }
        printWriter.close();
        bf.close();
        fileReader.close();
    }
}
