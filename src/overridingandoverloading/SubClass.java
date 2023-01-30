package overridingandoverloading;

public class SubClass extends SuperClass {

    @Override
    public void invokeInstanceMethod() {
        System.out.println("Subclass: invokeInstanceMethod переписан");
    }


    public void invokeInstanceMethod(String s ) {
        System.out.println("SubClass: overloaded invokeInstanceMethod(String)");
    }
}
