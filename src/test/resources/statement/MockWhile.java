public class MockWhile {
    public void test() {
        while (true) {

        }
    }

    public int returns42() {
        int i = 0;

        while (i < 42) {
            i++;
        }

        return i;
    }
}