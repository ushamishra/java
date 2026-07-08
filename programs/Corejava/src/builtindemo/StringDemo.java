package builtindemo;

public class StringDemo {

    public static void main(String[] args) {

        String str1 = "Mounika";
        String str2 = new String("mounika");
        String str3 = "Mounika";

         str3 = "Usha"+" "+ "M..";

        System.out.println(str1 );
        System.out.println(str2);

        System.out.println(str3);

        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.indexOf('k'));

        System.out.println(str1.substring(4,7));

        System.out.println(str1.toUpperCase());

        System.out.println(str3.replace("M..","Mishra"));

        StringBuffer sbf1 = new StringBuffer("Usha"); //thread safe/synchronized
        sbf1.append(" Mishra");
        System.out.println(sbf1);

        StringBuilder sbf2 = new StringBuilder("Mounika"); // not thread safe/synchronized
        sbf2.append(" Maragoni");
        System.out.println(sbf2);

        //p1  sbf2.append("xyz")
        //
        // p2 sbf2.append("abc")




    }
}
