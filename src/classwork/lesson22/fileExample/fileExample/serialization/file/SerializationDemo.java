package classwork.lesson22.fileExample.fileExample.serialization.file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializationDemo {

    private static final String FILE_PATH = "C:\\Users\\37493\\IdeaProjects\\JavaCore\\src\\classwork\\lesson22\\fileExample\\fileExample\\serialization\\file\\example.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        //for writing student object file

//        Student student = new Student("Poxos","Poxosyan", 36, "poxos@gmail.com");
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
//
//         objectOutputStream.writeObject(student);
//         objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
        Object object = objectInputStream.readObject();
        Student student = (Student) object;
        System.out.println(student);
    }
}
