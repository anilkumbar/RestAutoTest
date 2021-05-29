import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestCustomAnnotation {
    public static void main(String args[])throws Exception {

        AnnotationsJava h = new AnnotationsJava();
        Method m = h.getClass().getMethod("sayHello");

        MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
        System.out.println("value is: " + manno.value1()+","+manno.value2()+","+manno.value3());
    }
}
