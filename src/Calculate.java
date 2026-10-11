public class Calculate {
    Action ac = new Action();

    int sum = ac.calculate(10, 5, (a, b) -> a + b);
    int subtract = ac.calculate(10, 5, (a, b) -> a - b);
    int multiply = ac.calculate(10, 5, (a, b) -> a * b);
    int divide = ac.calculate(10, 5, (a, b) -> a / b);


    public int getDivide() {
        return divide;
    }

    public int getMultiply() {
        return multiply;
    }

    public int getSubtract() {
        return subtract;
    }

    public int getSum() {
        return sum;
    }
}
