// Parent Class (Super Class)
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child Class (Sub Class)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Main Class
public class Op_26_SingleInheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Parent class ka method use kiya
        d.bark(); // Apni class ka method use kiya
    }
}
