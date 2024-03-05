package lesson_7.presentation;

public class Main {
    public static void main(String[] args) {
        int messageStatus = 1;
        String userMessage = getUserMessage(messageStatus);

        // #  ##
        //  # ###
        // #  #
        // #
        //    ###
    }

    private static String getUserMessage(int messageStatus) {
        return switch (messageStatus) {
            case 0 -> {
                System.out.println("asdasd");
                yield "NOT SENT";
            }
            case 1 -> "SENT";
            case 2 -> "DELIVERED";
            default -> "UNKNOWN";
        };
    }

    private static void instanceOfExample() {
        ChildClass c = new ChildClass();
        System.out.println(c instanceof ChildClass);
        System.out.println(c instanceof BaseClass);
        System.out.println(c instanceof SomeInterface);
        System.out.println(c instanceof Object);
        BaseClass b = new BaseClass();
        BaseClass d = new ChildClass();
        if (d instanceof ChildClass) {
            ChildClass e = (ChildClass) d;
        }
    }
}
