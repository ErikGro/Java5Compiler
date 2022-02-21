public class MockOr {
    public void test() {
        boolean a = true || true;
        boolean b = true || false;
        boolean c = true || true || true;
        boolean d = true || true || false || true;
    }
}