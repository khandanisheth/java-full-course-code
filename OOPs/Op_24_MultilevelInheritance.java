// Parent Class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child Class (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Grandchild Class (inherits Dog)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }
}

// Main Class
public class Op_24_MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();  // Animal class ka method
        p.bark(); // Dog class ka method
        p.weep(); // Puppy class ka method
    }
}
