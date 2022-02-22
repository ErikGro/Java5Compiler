public class MockTerniary {
    public void test() {
        int a = true ? 42 : 43;
        int b = false ? 42 : 43;
    }

    public int returns42() {
        return true ? 42 : 0;
    }
}