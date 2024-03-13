public class Program1 {
    String name;
    int roll;

    // Parameterized constructor
    Program1(String n, int r) {
        name = n;
        roll = r;
    }

    void disp() {
        System.out.println("Student name is " + name);
        System.out.println("Student roll is " + roll);
    }

    public static void main(String[] args) {
        // Creating an instance of Program1 using the parameterized constructor
        Program1 obj = new Program1("Tarun", 159);

        // Calling the disp() method to display student information
        obj.disp();
    }
}
