package Que;

class ConstectorCopy {
    String department;
    String service;

    ConstectorCopy(String department, String service) {
        this.department = department;
        this.service = service;
    }

    ConstectorCopy(ConstectorCopy ib) {
        this.department = ib.department;
        this.service = ib.service;
    }

    public static void main(String[] args) {
        // Creating an original InterviewBit object
        ConstectorCopy original = new ConstectorCopy("Engineering", "Software Development");

        // Using the copy constructor to create a new object with the same values
        ConstectorCopy copied = new ConstectorCopy(original);

        // Modifying the copied object
        copied.service = "Quality Assurance";

        // Displaying the original and copied objects
        System.out.println("Original: " + original.department + " - " + original.service);
        System.out.println("Copied: " + copied.department + " - " + copied.service);
    }
}
