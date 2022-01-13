public class MockAnd {
    void test() {
        boolean a = (true && true);
        boolean b = (true && false);
        boolean c = (true && true && true && true && true && true && true && true && true);
        boolean d = (true && true && true && true && true && true && true && false && true);
    }
}