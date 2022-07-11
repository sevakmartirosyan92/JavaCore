package classwork.anotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno1 {
    String str();

    int val();
}

class Meta1 {
    @MyAnno1(str = "Два параметра", val = 19)
    public static void myMeth1(String str, int i){
        Meta1 ob = new Meta1();

        try {
            Class<?>c = ob.getClass();

            Method m = c.getMethod("myMeth1", String.class, int.class);
            MyAnno1 anno1 = m.getAnnotation(MyAnno1.class);

            System.out.println(anno1.str() + " " + anno1.val());

        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");

        }
    }

    public static void main(String[] args) {
            myMeth1("Тест",10);
    }
}
