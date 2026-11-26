public class PayrollManagementSystem {
    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee(
            1, "Abhishek","CS", 30000, 5000);

        PartTimeEmployee p = new PartTimeEmployee(
            2, "Rahul", "IT", 80, 200);

        System.out.println("--- Full Time Employee ---");
        f.display();

        System.out.println("\n--- Part Time Employee ---");
        p.display();
    }
}
class Employee {
    int empId;
    String name, department;

    Employee(int id, String n, String d) {
        empId = id;
        name = n;
        department = d;
    }

    void display() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    double baseSalary, bonus;

    FullTimeEmployee(int id, String n, String d, double b, double bonus) {
        super(id, n, d);
        baseSalary = b;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int id, String n, String d, int h, double r) {
        super(id, n, d);
        hoursWorked = h;
        hourlyRate = r;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

