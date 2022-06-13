public class Calculator {

    private int num1;
    private int num2;


    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;

    }

    public int add() {
        int numA = num1;
        int numB = num2;
        return Integer.sum(num1, num2);
    }

    public int subtract() {
        int numA = num1;
        int numB = num2;
        return (num1 - num2);

    }

    public int multiply() {
        int numA = num1;
        int numB = num2;
        return (num1 * num2);

    }

    public int divide() {
        int numA = num1;
        int numB = num2;
        return (num1 / num2);

    }
}
