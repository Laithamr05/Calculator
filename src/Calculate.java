public class Calculate {
    Action ac = new Action();

    int sum = ac.calculate(10, 5, (a, b) -> a + b);
    int subtract = ac.calculate(10, 5, (a, b) -> a - b);


    public int getSubtract() {
        return subtract;
    }

    public int getSum() {
        return sum;
    }
}
