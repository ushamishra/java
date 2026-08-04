package java8features;

public class MyClass3 implements MathematicalOperation{
    @Override
    public int operation(int a, int b) {
        return a*b;
    }

    @Override
    public String explainMathematicalProblem() {
        return "Mathematics is fun";
    }
}
