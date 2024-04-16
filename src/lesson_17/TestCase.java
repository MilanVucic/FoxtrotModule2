package lesson_17;

public class TestCase {
    private boolean privateVar;
    public int publicVar;
    protected int protectedVar;
    public int staticVar;
    private int privateField;

    public TestCase() {
    }

    private TestCase(boolean privateVar) {
        this.privateVar = privateVar;
    }

    public void aPublicMethod(int param) {

    }
    protected void aProtectedMethod(int param) {

    }

    private void aPrivateMethod(int param) {
        System.out.println("I'm a private method:" + param);
    }

    private void aPrivateMethod(int param, String something) {
        System.out.println("I'm a private method:" + param);
    }

    @Override
    public String toString() {
        return privateVar + " " + privateField;
    }
}
