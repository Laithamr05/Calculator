public class Calculate {
    Action ac = new Action();

    int sum = ac.calculate(10, 5, (a, b) -> a + b);

    public int getSum() {
        return sum;
    }
}
