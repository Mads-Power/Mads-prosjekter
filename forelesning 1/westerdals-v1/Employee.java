public class Employee extends Person{
    //Attributter
    private String firstName;
    private String familyName;
    private String socialSecurityNumber;
    private String employeeNumber;
    private int salary;

    //Konstruktør
    public Employee(String employeeNumber, String socialSecurityNumber,
    String firstName, String familyName, int salary) {
        setFirstName(firstName);
        setFamilyName(familyName);
        setSocialSecurityNumber(socialSecurityNumber);
        setEmployeeNumber(employeeNumber);
        setSalary(salary);
    }

    //tilgangsmetoder

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }   

    public int getSalary() {
        return salary;
    }

    public String toString() {
        String retur = "(aNr " + getEmployeeNumber() + ") " + " (pNr " + getSocialSecurityNumber() + getFirstName()
            + " " + getFamilyName() 
            + ") Lønn: " + getSalary();
        return retur;
    }
}