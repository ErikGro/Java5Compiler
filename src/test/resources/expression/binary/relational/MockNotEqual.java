public class MockNotEqual {
    public void test() {
        boolean a = (42 != 43);
        boolean b = (42 != 42);
    }

    public int returns42() {
        boolean a = (1 != 0);
        if (a) {
            return 42;
        } else {
            return 0;
        }
    }
}