package overriding;

public class Human extends Mammal{
    @Override
    public String sayHello() {
        return "hello";
    }
}
