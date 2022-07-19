public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Orang banten");

        Company.Employee employee = company.new Employee();
        employee.setName("Anjink");

        System.out.println(employee.getName());

    }
}
