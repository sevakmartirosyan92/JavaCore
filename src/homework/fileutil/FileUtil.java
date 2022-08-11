package homework.fileutil;


import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String FILE_PATH = "C:\\Users\\37493\\IdeaProjects\\JavaCore\\src\\homework\\fileutil\\file.txt";
    private static final String FILE_NAME = "file.txt";

    public static void main(String[] args) throws IOException {
   //     fileSearch();
        contentSearch();
//        findLines();
//        printSizeOfPackage();
//        createFileWithContent();
    }


    static void fileSearch() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input file name for search");
        String fileName = scanner.nextLine();
        File file = new File(path, fileName);
        System.out.println(file.exists());
    }

    static void contentSearch() throws IOException {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input keword for search");
        String keyword = scanner.nextLine();
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().endsWith(".txt");
                }
            });
            for (File file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line = "";
                    while ((line=br.readLine())!=null){
                             if (line.contains(keyword)){
                                 System.out.println(file.getAbsolutePath());
                                 break;
                             }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Please iput correct directory path");
        }
    }
}


//    static void findLines() throws IOException {
//        System.out.println("Please input txt path");
//        String path = scanner.nextLine();
//
//        System.out.println("Please input keyword");
//        String keyword = scanner.nextLine();
//
//        File file = new File(path);
//        File[] files = file.listFiles();
//        for (File file1 : files) {
//            try (BufferedReader bf = new BufferedReader(new FileReader(file1.getAbsoluteFile()))) {
//                String line = "";
//                while ((line = bf.readLine()) != null) {
//                    if (line.contains(keyword)) {
//                        System.out.println(line);
//                    }
//                }
//
//            }
//        }
//    }
//
//    static void printSizeOfPackage() {
//        System.out.println("Please input path");
//        String path = scanner.nextLine();
//        File file = new File(path);
//        File[] files = file.listFiles();
//        if (files != null) {
//            int size = 0;
//            for (File file1 : files) {
//                size += file1.length();
//            }
//            System.out.println(size);
//        }
//    }
//
//    static void createFileWithContent() throws IOException {
//        System.out.println("Please input path");
//        String path = scanner.nextLine();
//
//        System.out.println("Please input file name ");
//        String fileName = scanner.nextLine();
//
//        System.out.println("Please input content");
//        String content = scanner.nextLine();
//        File myFile = new File(path);
//        try {
//            if (myFile.exists() && myFile.isDirectory()) {
//                StringBuilder pathStr = new StringBuilder(path);
//                pathStr.append(fileName);
//                File folder = new File(String.valueOf(pathStr));
//                boolean create = folder.createNewFile();
//                BufferedWriter bw = new BufferedWriter(new FileWriter(String.valueOf(pathStr)));
//                bw.write(content);
//                bw.close();
//                System.out.println("File created");
//                System.out.println(create);
//            }
//        }
//            catch(IOException e){
//                System.out.println(e);
//            }
//        }
//    }






