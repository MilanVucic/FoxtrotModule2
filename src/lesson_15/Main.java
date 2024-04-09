package lesson_15;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> numbers = new MyStack<>();
        numbers.push(10);
        numbers.push(15);
        numbers.push(11);
        numbers.push(100);
        System.out.println(numbers.pop());
        System.out.println(numbers.pop());
        System.out.println(numbers.pop());
        System.out.println(numbers.pop());
    }

    private static void innerLocalClassExample() {
        class TemporaryResultCallback implements ResultCallback {
            private String result;

            public TemporaryResultCallback(String result) {
                this.result = result;
            }

            @Override
            public void onSuccess(String result) {
                print("Yay: " + TemporaryResultCallback.this.result + " " + result);
            }

            @Override
            public void onError(String error) {
                print("Error has occurred. Details:" + error);
            }

            private void print(String message) {
                System.out.println(message);
            }
        }

        ResultGetter resultGetter = new ResultGetter(new TemporaryResultCallback("asd"));

        ResultGetter resultGetter2 = new ResultGetter(new TemporaryResultCallback("qwe"));
    }

    private static void outerInnerExample() {
        OuterClass outerClass = new OuterClass(500);
        OuterClass outerClass2 = new OuterClass(300);
        OuterClass.InnerNonStaticClass innerClass = outerClass.new InnerNonStaticClass();
        OuterClass.InnerNonStaticClass innerClass2 = outerClass2.new InnerNonStaticClass();
        innerClass.doSomething();
        innerClass2.doSomething();

        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
        innerStaticClass.doSomething();
    }
}
