package developer.application;

import developer.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
    Company company = new Company();
    company.setCompanyName("john");

        Company.Employee employee = company.new Employee();
        employee.setEmployeeName("Kenedy");

        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setCompanyName("johnny");

        Company.Employee employee2 = company2.new Employee();
        employee2.setEmployeeName("Kenedyxs");

        System.out.println(employee2.getEmployeeName());
        System.out.println(employee2.getCompany());
    }
}
