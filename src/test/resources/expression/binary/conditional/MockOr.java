public class MockOr {
    void test() {
        boolean a = (true || true);
        boolean b = (true || false);
        boolean c = (false || false || false || false || false || false || false);
        boolean d = (false || false || false || false || false || false || true);
    }
}