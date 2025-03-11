class Employee {
    private static String companyName = "Capgemini"; // Static variable
    private static int totalEmployees = 0; // Static counter
    private final int id; // Final variable
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) { // Using instanceof
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("\nTotal Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Pranav", "Software Engineer");
        Employee emp2 = new Employee(2, "Abhay", "HR Manager");

        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }
}

