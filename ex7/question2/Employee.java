import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String position;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee subordinate) {
        subordinates.add(subordinate);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Employee :[ Name : ").append(name);
        result.append(", position : ").append(position);
        result.append(", salary : ").append(salary).append(" ]");

        if (!subordinates.isEmpty()) {
            result.append("\nSubordinates: ");
            for (Employee subordinate : subordinates) {
                result.append("\n   ").append(subordinate.toString());
            }
        }

        return result.toString();
    }
}
