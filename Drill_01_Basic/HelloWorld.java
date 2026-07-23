public class HelloWorld {
    public static void main(String[] args){
        Dog animal1 = new Dog();
        Cat animal2 = new Cat();
        Duck animal3 = new Duck();
        animal1.sayHello();
        animal2.sayHello();
        animal3.sayHello();
    }
}
class Dog {
    public void sayHello() {
        System.out.println("Woof!");
    }
}

class Cat {
    public void sayHello() {
        System.out.println("Meow!");
    }
}

class Duck {
    public void sayHello() {
        System.out.println("Quack!");
    }
}