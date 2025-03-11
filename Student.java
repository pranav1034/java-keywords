class Student {
    private static String universityName = "Chitkara University"; // Static variable
    private final int rollNumber; // Final variable
    private String name;
    private String grade;
    private static int totalStudents=0;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) { // Using instanceof
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
    public static void main(String[] args) {
        Student stu1 = new Student(101, "Pranav", "S");
        Student stu2 = new Student(102, "Abhay", "A");

        stu1.displayStudentDetails();
        System.out.println();
        stu2.displayStudentDetails();
        System.out.println("\nThe total number of enrolled students are: "+totalStudents);
    }
}