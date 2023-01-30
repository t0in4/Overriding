package overriding;

public class Main {
    public static void main(String[] args) {

        Mammal mammal = new Mammal();
        System.out.println(mammal.sayHello());

        Human human = new Human();
        System.out.println(human.sayHello());

        Cat cat = new Cat();
        System.out.println(cat.sayHello());

        // Правила для перезаписи методов
        /*
        1. У метода должно быть такое же имя как и в родительском классе
        2. Аргументы должны быть такими же как и у метода в родительском классе
        3. Возвращаемый тип должен быть таким же или должен быть подтипом
           возвращаемого типа декларированного в методе суперкласса
        4. Модификатор доступа должен быть таким же или более открытым чем у
           перезаписываемого метода
         */
    }
}