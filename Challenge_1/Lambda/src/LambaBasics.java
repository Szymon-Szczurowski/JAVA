
// interfejs funkcyjny
interface Addition {
    int add(int a, int b);
}

// interfejs funkcyjny
interface  MathOperation <T>{
    T operate(T a, T b);
}

public class LambaBasics {

    public void test(Addition addition){
        System.out.println(addition.add(100, 150));
    }
    public static void main(String[] args) {

        Addition addition = (int a, int b) -> a + b;
        System.out.println(addition.add(11,6)); //17
        System.out.println(addition.add(20,5)); //25

        LambaBasics lambaBasics = new LambaBasics();
        lambaBasics.test((a, b) -> a*2 + b); //250

        MathOperation<Float> addition2 = (a,b) -> a + b;
        System.out.println(addition2.operate(10.0f,6.0f)); //16.0

        MathOperation<Integer> substraction = (a,b) -> a - b;
        System.out.println(substraction.operate(100, 77)); //23

    }
}
