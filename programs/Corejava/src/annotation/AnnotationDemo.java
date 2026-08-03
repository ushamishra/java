package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface MyAnnontation{

    String name();

    String date() default "not specified";

    int age() default 19;
    


    

}

@MyAnnontation(name="Usha",date="8/9/2027")
public class AnnotationDemo {

    public static void main(String[] args) {


        Class<AnnotationDemo> clazz = AnnotationDemo.class;

        if (clazz.isAnnotationPresent(MyAnnontation.class)) {

            MyAnnontation info = clazz.getAnnotation(MyAnnontation.class);

            System.out.println("name : " + info.name());
            System.out.println("Date      : " + info.date());
            System.out.println("age   : " + info.age());
        }
    }
}
