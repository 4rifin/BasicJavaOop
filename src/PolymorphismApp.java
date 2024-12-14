public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Arifin");
        employee.sayHello("Budi Employee");

        employee = new Manager("Arifin");
        employee.sayHello("Budi Manager");

        employee = new VicePresident("Arifin");
        employee.sayHello("Budi Vice President");

        sayHello(new Employee("Arifin Employee"));
        sayHello(new Manager("Arifin Manager"));
        sayHello(new VicePresident("Arifin Vice President"));

    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello Vice President "+vicePresident.name);
        }else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager "+manager.name);
        }else {
            System.out.println("Hello Employee "+employee.name);
        }


    }
}
