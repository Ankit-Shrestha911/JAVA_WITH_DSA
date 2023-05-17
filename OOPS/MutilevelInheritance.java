public class MutilevelInheritance {
    public static void main(String[] args) {

        Puppy p1 = new Puppy();
        p1.bark();
        p1.play();
        p1.eat();

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

class Puppy extends Dog {

    void play() {
        System.out.println("Puppy is playing");
    }

}
