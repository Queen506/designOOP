public class App {
    public static void main(String[] args) {
        Employee ceo = new Employee("Settha", "CEO", 500000);
        Employee headSales = new Employee("Kamphaka", "Head Sales", 300000);
        Employee sales1 = new Employee("Wiroj", "Sales", 150000);
        Employee sales2 = new Employee("Weeranan", "Sales", 100000);
        Employee headMarketing = new Employee("UngInk", "Head Marketing", 300000);
        Employee marketing1 = new Employee("Oak", "Marketing", 200000);
        Employee marketing2 = new Employee("Aem", "Marketing", 250000);

        ceo.addSubordinate(headSales);
        ceo.addSubordinate(headMarketing);
        headSales.addSubordinate(sales1);
        headSales.addSubordinate(sales2);
        headMarketing.addSubordinate(marketing1);
        headMarketing.addSubordinate(marketing2);

        printAllEmployee(ceo);
    }

    public static void printAllEmployee(Employee ceo) {
        System.out.println(ceo);
        for (Employee subordinate : ceo.getSubordinates()) {
            printEmployee(subordinate, 1);
        }
    }

    public static void printEmployee(Employee employee, int level) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indent.append("   ");
        }

        System.out.println(indent.toString() + employee);

        for (Employee subordinate : employee.getSubordinates()) {
            printEmployee(subordinate, level + 1);
        }
    }
}
