package developer.data;

/**
 * InnerClass
 */
public class Company {
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Company() {

    }


    public class Employee {
        private String employeeName;

        public String getCompany(){
            return Company.this.companyName;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }
    }
}
