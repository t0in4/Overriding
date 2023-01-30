package overriding;

public class Cat extends Mammal{
    @Override
    public String sayHello() {
        return "meow";
    }

    @Override
    public String sayEnd() {

        return null;
    }
}
