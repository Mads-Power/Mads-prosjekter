public class Student extends Person {
    //Attributter
    private String firstName;
    private String familyName;
    private String socialSecurityNumber;
    private String studentNumber;
    private int credits;

    //Konstruktør
    public Student(String studentNumber, String socialSecurityNumber,
            String firstName, String familyName, int credits) {
        setFirstName(firstName);
        setFamilyName(familyName);
        setSocialSecurityNumber(socialSecurityNumber);
        setStudentNumber(studentNumber);
        setCredits(credits);
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
    
    
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }   

    public int getCredits() {
        return credits;
    }

    public String toString() {
        String retur = "(sNr " + getStudentNumber() + ") "+ " (pNr " + getSocialSecurityNumber() + getFirstName()
            + " " + getFamilyName() 
            + ") Studiepoeng: " + getCredits();
        return retur;
    }
}
