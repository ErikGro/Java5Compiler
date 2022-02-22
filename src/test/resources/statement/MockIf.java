public class MockIf {
    public void test() {
        if (42 > 0) {

        }

        if (42 < 0) {

        }

        if (42 == 42) {

        } else if (true) {

        } else {

        }
    }

    public int returns42() {
        if (true) {
            return 42;
        } else {
            return 0;
        }
    }
}