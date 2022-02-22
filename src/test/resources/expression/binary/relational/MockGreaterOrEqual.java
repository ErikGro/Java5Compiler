public class MockGreaterOrEqual {
    public void test() {
        boolean a = (42 >= 43);
        boolean b = (42 >= 42);
        boolean c = (42 >= 41);
    }

    public int returns42() {
        boolean a = (44 >= 43);
        if (a) {
            return 42;
        } else {
            return 0;
        }
    }
}