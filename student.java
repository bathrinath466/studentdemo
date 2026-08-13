class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id; 
        System.out.println("Constructor called for " + name);
    }

    // Display method
    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }

    // Finalize method (for demonstration only)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destructor called for " + name);
    }

    public static void main(String[] args) {

        Student[] s = new Student[3];

        s[0] = new Student(101, "Alice");
        s[1] = new Student(102, "Bob");
        s[2] = new Student(103, "Charlie");

        System.out.println("\nStudent Details:");

        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }

        // Make objects eligible for garbage collection
        s = null;
        System.gc();

        System.out.println("End of Program");
    }
}