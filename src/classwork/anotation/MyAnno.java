package classwork.anotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();
    int val();
}

class Meta{
    @MyAnno(str = "пример анотации", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();

        try{
            Class<?>c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());



        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
