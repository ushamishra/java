package java8features;

public interface MathematicalOperation {

    public int operation(int a,int b);

    public default String explainMathematicalProblem(){

        return "Mathematics";
    }

    public static double generateNumber(){
        return Math.random();
    }
}
