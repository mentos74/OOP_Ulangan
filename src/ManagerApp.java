public class ManagerApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Lotan");
        employee.sayHello("Asu");

        employee = new Manager("Lotan");
        employee.sayHello("Asu");

        employee = new VicePresident("Lotan");
        employee.sayHello("Asu");
    }
    static void Assalamualaikum (String asu                               ){

    }
}
