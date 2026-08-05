package java8features;

@FunctionalInterface
public interface AbcInterface {

    //only one method declaration

    int getIntVal(String str);

    default void m1(){

    }

    static int m2(){
        return 9;
    }


}
