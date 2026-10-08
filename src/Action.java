public class Action {

    public int calculate(int a, int b, Operation operation) {
        return operation.apply(a, b);
    }
}