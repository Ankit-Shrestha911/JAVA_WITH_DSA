public class SingleInheritance {
    public static void main(String[] args) {
        Dog cheery = new Dog();
        cheery.bark();
        cheery.eat();
        
    }
}


class Animal{
    void eat(){
        System.out.println("Animal eating");
    }

    void sleep()
    {
        System.out.println("Animal sleeping");
    }
}

class Dog extends Animal{

    void bark() {
        System.out.println("Dog is Barking");
    }
}