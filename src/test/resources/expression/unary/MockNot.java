public class MockNot {
    public void test() {
        boolean a = !true;
        boolean b = !!true;
        boolean c = !(42 > 43);
    }

    public int returns42() {
        return !false ? 42 : 0;
    }
}