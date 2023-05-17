public class HierarchialInheritance {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();

        c1.meow();
        c1.eat();

        d1.bark();
        d1.eat();

    }
}

class Animal {
    void eat() {
        System.out.println("Animal eating");
    }

    void sleep() {
        System.out.println("Animal sleeping");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is Barking");
    }
}

class Cat extends Animal {
    void meow(){
        System.out.println("Cat is meowing");
    }

    void jump() {
        System.out.println("Cat is jumping");
    }
}
