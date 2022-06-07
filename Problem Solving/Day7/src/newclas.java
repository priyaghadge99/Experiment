/*
public class newclas {
    public class ReadFileLast {
        public static void main(String[] args) {
            ReadFileLast rf = new ReadFileLast();
            File file = new File("F:\\NetJS\\test\\aa.txt");
            // calling method
            rf.readFromLast(file);
            //rf.reverseLines(file);
        }

        // Read last line of the file
        public void readFromLast(File file){
            int lines = 0;
            StringBuilder builder = new StringBuilder();
            RandomAccessFile randomAccessFile = null;
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                long fileLength = file.length() - 1;
                // Set the pointer at the last of the file
                randomAccessFile.seek(fileLength);
                for(long pointer = fileLength; pointer >= 0; pointer--){
                    randomAccessFile.seek(pointer);
                    char c;
                    // read from the last one char at the time
                    c = (char)randomAccessFile.read();
                    // break when end of the line
                    if(c == '\n'){
                        break;
                    }
                    builder.append(c);
                }
                // Since line is read from the last so it
                // is in reverse so use reverse method to make it right
                builder.reverse();
                System.out.println("Line - " + builder.toString());
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }finally{
                if(randomAccessFile != null){
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
*/
