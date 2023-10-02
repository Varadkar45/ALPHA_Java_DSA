public class copyconstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Shreyas";
        s1.roll = 45;
        s1.password = "abcde";
        s1.marks[0] = 100;
        s1.marks[1] = 78;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s1.password = "xyz";
        s1.marks[2] = 90;
        for(int i = 0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }

        
    }
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
    Student() {
        marks = new int[3];
    }

    
}