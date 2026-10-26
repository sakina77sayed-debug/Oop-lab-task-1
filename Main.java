/* ==========================================================
   OOP Lab Task - 1
   Name: Bibi Sakina 
   Roll no: 2260051
   GitHub ID: sakina77sayed-debug
   
    Description:
   1. In this task, a UniversityPersonnel base class is created containing name, age, and gender variables.
   2. Student and Teacher classes inherit (extend) from the UniversityPersonnel class.
   3. Constructors and display methods are used to initialize and print the object values.
   ========================================================== */

class UniversityPersonnel {
    String name;
    int age;
    String gender;

    UniversityPersonnel(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
    }
}

class Student extends UniversityPersonnel {
    String degreeProgram;
    double cgpa;
    int semester;

    Student(String name, int age, String gender, String degreeProgram, double cgpa, int semester) {
        super(name, age, gender);
        this.degreeProgram = degreeProgram;
        this.cgpa = cgpa;
        this.semester = semester;
    }

    void displayStudentInfo() {
        System.out.println("--- Student Information ---");
        displayInfo();
        System.out.println("Degree Program : " + degreeProgram);
        System.out.println("CGPA : " + cgpa);
        System.out.println("Semester : " + semester);
    }
}

class Teacher extends UniversityPersonnel {
    String designation;
    double salary;
    String department;

    Teacher(String name, int age, String gender, String designation, double salary, String department) {
        super(name, age, gender);
        this.designation = designation;
        this.salary = salary;
        this.department = department;
    }

    void displayTeacherInfo() {
        System.out.println("--- Teacher Information ---");
        displayInfo();
        System.out.println("Department : " + department);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Ali", 20, "Male", "BS Computer Science", 3.5, 3);
        s.displayStudentInfo();

        System.out.println();

        Teacher t = new Teacher("Sir Ahmed", 40, "Male", "Professor", 75000.0, "Computer Science");
        t.displayTeacherInfo();
    }
}
