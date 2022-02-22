public class MockOr {
    public void test() {
        boolean a = true || true;
        boolean b = true || false;
        boolean c = true || true || true;
        boolean d = true || true || false || true;
    }

    public int returns42() {
        boolean a = true || false;
        if (a) {
            return 42;
        } else {
            return -1;
        }
    }
}