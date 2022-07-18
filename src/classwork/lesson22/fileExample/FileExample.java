package classwork.lesson22.fileExample;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {

    static String filePath = "C:\\Users\\37493\\IdeaProjects\\JavaCore\\src\\classwork\\lesson22\\fileExample\\testFolder\\hello3.txt";
    static String newFilePath = "C:\\Users\\37493\\IdeaProjects\\JavaCore\\src\\classwork\\lesson22\\fileExample\\testFolder\\hello3.txt";

    public static void main(String[] args) throws IOException {
        File myFile = new File(filePath);
        Date date = new Date(myFile.lastModified());
        System.out.println(date);



//        boolean b = myFile.renameTo(new File(newFilePath));
//        System.out.println(b);
//

        //    System.out.println(myFile.exists());
//        if (!myFile.exists()){
//            myFile.createNewFile();
//            System.out.println(myFile.exists());
//        }
//        System.out.println("isFile: " + myFile.isFile());
//        System.out.println("isFile: " + myFile.isDirectory());
//        if (myFile.isDirectory()){
//            File[] files = myFile.listFiles();
//            for (File file : files) {
//                if (file.isDirectory())
//                System.out.println(file.getName());
//            }
//        }


    }
}
