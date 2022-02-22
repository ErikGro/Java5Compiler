public class MockBitXOR {
    public void test() {
        int a = 1 ^ 2;
        int b = 42 ^ 295;
    }

    public int returns42() {
        int a = 1 ^ 2;
        if (a == 3) {
            return 42;
        } else {
            return 0;
        }
    }
}