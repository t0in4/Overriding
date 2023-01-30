package overridingandoverloading;

public class SubClass extends SuperClass {
    // переписываем метод
    @Override
    public void invokeInstanceMethod() {
        System.out.println("Subclass: invokeInstanceMethod переписан");
    }

    // перегружаем метод, добавили параметр String s
    public void invokeInstanceMethod(String s) {
        System.out.println(String.format("SubClass: overloaded invokeInstanceMethod(%s)", s));
    }
    public void invokeInstanceMethod(double s) {
        System.out.println(String.format("SubClass: overloaded invokeInstanceMethod(%.2f)", s));
    }
    public void invokeInstanceMethod(int s) {
        System.out.println(String.format("SubClass: overloaded invokeInstanceMethod(%d)", s));
    }
}
