public class DefaultValues {


    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    String str;

    public DefaultValues(){

    }

    public DefaultValues(byte b, short s, int i, long l, float f, double d, String str) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
        this.str = str;
    }

    public void m1(){

    }

    static void m2(){

    }

    public static void main(String[] args) {

        DefaultValues obj = new DefaultValues() ;
        System.out.println(obj.toString());

        DefaultValues obj1 = new DefaultValues((byte)12, (short) 190,1300,17637663,34.67f,45554.56,"hello");


        System.out.println(obj1.toString());


    }

    @Override
    public String toString() {
        return "DefaultValues{" +
                "b=" + b +
                ", s=" + s +
                ", i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", str='" + str + '\'' +
                '}';
    }
}

