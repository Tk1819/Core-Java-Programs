

public class Program2 {
    String name;
    int roll;
    float per;

    // Corrected constructor name to match the class name
    Program2(String name, int roll, float per) {
        this.name = name;
        this.roll = roll;
        this.per = per;
    }

    public void display() {
        System.out.println("Student name is " + this.name);
        System.out.println("Student roll is " + this.roll);
        System.out.println("Student percentage is " + this.per);
    }

    public static void main(String[] args) {
        // Creating an instance of Program2 using the parameterized constructor
        Program2 student = new Program2("Mahak", 101, 90.8f);

        // Calling the display() method to show student information
        student.display();
    }
}
