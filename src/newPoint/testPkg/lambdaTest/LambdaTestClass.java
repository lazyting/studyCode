package testPkg.lambdaTest;

/**
 * Created by Lei on 2019/3/14.
 */
public class LambdaTestClass {

    public static void main(String[] args) {
        LambdaTestClass lambdaTestClass = new LambdaTestClass();
        InterA a =(aa,b) -> 5  ;
        System.out.println(a);

    }

    interface InterA {
        int operate(int a, int b);
    }

    interface InterB {
        void sayMessagr(String message);
    }

    private int operate(int a, int b, InterA interA) {
        return interA.operate(a, b);
    }

}
