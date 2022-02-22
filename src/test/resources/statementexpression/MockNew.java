public class MockNew {
    public Hans hans = new Hans();

    public void test() {
        Hans h = new Hans();
    }

    public int returns42() {
        return hans.i;
    }
}

class Hans {
    public int i = 42;
}