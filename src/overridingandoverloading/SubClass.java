package overridingandoverloading;

public class SubClass extends SuperClass {
    // переписываем метод
    @Override
    public void invokeInstanceMethod() {
        System.out.println("Subclass: invokeInstanceMethod переписан");
    }

    // перегружаем метод, добавили параметр String s
    public void invokeInstanceMethod(String s ) {
        System.out.println("SubClass: overloaded invokeInstanceMethod(String)");
    }
}
