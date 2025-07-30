class Student {
    private String name;  // ✅ Private variable
    private int age;      // ✅ Private variable

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age (With Validation)
    public void setAge(int newAge) {
        if (newAge > 0) { // ✅ Validation
            this.age = newAge;
        } else {
            System.out.println("Invalid age! Age must be positive.");
        }
    }
}

public class Op_20_Encapsulation{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ali");
        s1.setAge(20);  // ✅ Valid Age
        s1.setAge(-5);  // ❌ Invalid Age
        
        System.out.println(s1.getName() + " is " + s1.getAge() + " years old.");
    }
}
