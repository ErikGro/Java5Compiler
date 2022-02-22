public class MockNegate {
    public void test() {
        int a = 42;
        int b = -a;
    }

    public int returns42() {
        int negative = -42;
        return -negative;
    }
}