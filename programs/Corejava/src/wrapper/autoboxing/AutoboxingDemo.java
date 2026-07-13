package wrapper.autoboxing;


import org.w3c.dom.ls.LSOutput;

public class AutoboxingDemo {

    public static void main(String[] args) {

        byte b = 12;
        short s = 210;
        int i = 2000;
        long l = 7643478;
        float f = 89.56f;
        double d = 1284231734.67d;
        char c = 'A';
        boolean isChecked = true;

//        Autoboxing is the automatic conversion of a primitive data type to its corresponding wrapper class object by the Java compiler.

        Byte B = b;
        Byte bObj = 23;
//        System.out.println(B.compareTo(bObj));
        Short S = s;
        Integer I = i;
        Float F = f;
        Double D = d;
        Character C = c;
        Boolean booleanObj = isChecked;

//        Unboxing is the reverse process, automatically converting a wrapper object back into its primitive value. These features

        byte newB = B;
        System.out.println(newB);

        short s1 = S;

        int  i1 = I;
        float ft = F;
        double  d1 = D;
        char  c1 = C;
        boolean isChecked1 = booleanObj;

    }




}
