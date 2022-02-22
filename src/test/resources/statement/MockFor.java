public class MockFor {
    public void test() {
        for (int i = 0; i < 42; i++) {

        }
    }

    public int returns42() {
        for (int i = 0; i <= 42; i++) {
            if (i == 42) {
                return 42;
            }
        }

        return 0;
    }
}