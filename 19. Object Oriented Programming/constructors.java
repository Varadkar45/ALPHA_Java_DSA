public class constructors {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Shreyas");
        Student s3 = new Student(55);
        // Student s4 = new Student("Shreyas",55);
    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Constructor is called.. ");
    }

    Student(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    Student(int roll) {
        this.roll = roll;
        System.out.println(this.roll);
    }
}