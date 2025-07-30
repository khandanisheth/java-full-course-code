// Parent Class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child Class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Child Class 2
class Cat extends Dog {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

// Main Class
public class Op_21_HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Animal class ka method
        d.bark(); // Dog class ka method

        
        Cat c=new Cat();
        c.bark();// Cat class ka method
        c.eat();  // Animal class ka method
        c.meow(); // Cat class ka method
    }
}
