public class constructors {
    public static void main(String args[]) {
        Student s1 = new Student();
    }
}
class Student {
    String name;
    int roll;
    Student() {//constructor
        System.out.println("Constructor is called.....");
    }
}

/*
public class constructors {
    public static void main(String args[]) {
        Student s1 = new Student("Shreyas");
        System.out.println(s1.name);
    }
}
class Student {
    String name;
    int roll;
    Student(String name) {//constructor
        this.name = name;
    }
}

 */
