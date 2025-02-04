class Person1 {
    String name;
    int age;
    
    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person1 {
    int studentId;
    
    Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Student ID: " + studentId);
    }
}

class ThisSuperDemo {
    public static void main(String[] args) {
        Student s = new Student("Arjun", 19, 123);
        s.display();
    }
}
