package classwork.lesson22.fileExample.fileExample.ioExamples.file;

import java.io.*;

public class FileRedAndWrite {

    private static final String FILE_PATH = "C:\\Users\\37493\\IdeaProjects\\JavaCore\\src\\classwork\\lesson22\\fileExample\\fileExample\\ioExamples\\file\\textExample.txt";

    public static void main(String[] args) throws IOException {

        //write();
        read();

    }

    private static void write() throws IOException {
        //try с ресурсами!
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("H e llo from JAVA\r\n");
            bw.write("Hello from Java line 2 !!!!!!!!!!");

        }
    }

    private static void read() throws IOException {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            while ((line = inputStream.readLine()) != null){
//                System.out.println(line);


            int c;
            int aCount=0;
            while ((c=inputStream.read()) !=-1){
                char a = (char) c;
                if (a == 'a'){
                    aCount++;
                }
                System.out.print(a);
            }
            System.out.println("aCount: " + aCount);
            }
        }
    }

