import java.io.*;

public class CopyFile {
    static int count;

    public static void readFilefromLast(File file) {

        StringBuilder builder = new StringBuilder();
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            int length = (int) file.length();
            // Set the pointer at the last of the file
//            for (long i = length; i > -1; i--) {
            randomAccessFile.seek(length);
            for (int pointer = length; pointer > -1; pointer--) {
                randomAccessFile.seek(pointer);

                char c;
                //read a character
                c = (char) randomAccessFile.read();
                // break when end of the line
                if (c == '\n') {
                    break;
                }
                builder.append(c);
                // Since line is read from the last so it
                // is in reverse so use reverse method to make it right
            }
            builder.reverse();
            System.out.printf("Line - %s%n", builder.toString());

            for (int i = length; i > -1; i--) {

                String line = randomAccessFile.readLine();
                System.out.println(line);
            }
//        }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        CopyFile copyFile = new CopyFile();

        File file = new File("E://x.txt");
        FileReader fin = new FileReader("E://x.txt");
//        Scanner sc = new Scanner(fin);
        System.out.println("Reading from last");
        readFilefromLast(file);

        BufferedReader reader = new BufferedReader(fin);
        FileWriter fout = new FileWriter("E://y.txt", true);
        int c;


        while (reader.lines() != null) {
            reader.lines();

            count++;
        }
        System.out.println("Total Number of Lines: " + count);
//        for(int i=count;i>-1;i--)
//        {
//        while ((c = fin.read()) != -1 ) {  ////This read() method reads one character at a time from the buffered stream and return itas an integer value.
////            for (int i = count; i > -1; i--) {
//                fout.write(c);
//            System.out.println(c);
//            }
//    /*    while ( c= readFilefromLast(file)){
//            fout.write(c);
//
//        }

        System.out.println("Copy finish...");
        fin.close();
        fout.close();

    }

}
//}

