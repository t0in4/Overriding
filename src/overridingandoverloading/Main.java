package overridingandoverloading;

public class Main {

    public static void main(String[] args) {
        SubClass clazz = new SubClass();

        // переписываем метод invokeInstanceMethod
        clazz.invokeInstanceMethod();

        clazz.invokeInstanceMethod("Hello");
    }
}
