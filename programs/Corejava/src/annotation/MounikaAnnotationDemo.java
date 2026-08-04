package annotation;

@Mounika(developerOfTheCode="Ajit",date="02/04/2026",hoursSpentInDevlopment = 10)
class SomeClass {


}
public class MounikaAnnotationDemo {

    public static void main(String[] args) {

        try {
            Mounika mounika = Class.forName("annotation.SomeClass").getAnnotation(Mounika.class);
            System.out.println(mounika.developerOfTheCode());
            System.out.println(mounika.date());
            System.out.println(mounika.hoursSpentInDevlopment());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
