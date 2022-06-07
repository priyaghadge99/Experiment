import java.io.*;
import java.util.Scanner;

//Q12.	Program to write even and odd integers into different files.
public class Program12 {
    public static void main(String[] args) throws IOException {


        FileWriter fileWriter = new FileWriter("E://x.txt");
        FileWriter fileWriter1 = new FileWriter("E://y.txt");
        BufferedWriter bf = new BufferedWriter(fileWriter);
        BufferedWriter bf2 = new BufferedWriter(fileWriter1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (int i = 0; i < 5; i++) {
            int nums = scanner.nextInt();
            if (nums % 2 == 0) {
               bf.write(nums);
               bf.newLine();

            } else {
              bf2.write(nums);
              bf2.newLine();
            }
        }
        bf.close();
        bf2.close();
        fileWriter1.close();
        fileWriter.close();

        FileReader fileReader = new FileReader("E://x.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileReader fileReader1 = new FileReader("E://y.txt");
        BufferedReader bufferedReader2 = new BufferedReader(fileReader1);

        int read = bufferedReader.read();
        System.out.println("File First :- " +read);
        int read2 = bufferedReader2.read();
        System.out.println("File Second :- " + read2);

        bufferedReader.close();
        bufferedReader2.close();
        fileReader.close();
        fileReader1.close();
    }
}


//its not returning correct output