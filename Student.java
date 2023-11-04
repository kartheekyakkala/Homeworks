//Author KRISHNA SAI YAKKALA
public class Student {
    private Name fullName;
    private String id; // identification number

    public Student ()
    {
        fullName = new Name ();//  or null;
        id = "";
    } // end default constructor

    public Student(Name studentName, String studentId) {
        fullName = studentName;
        id = studentId;
    } // end constructor

    public void setStudent(Name studentName, String studentId) {
        setName(studentName); // or fullName = studentName;
        setId(studentId); // or id = studentId;
    } // end setStudent

    public void setName(Name studentName) {
        fullName = studentName;
    } // end setName

    public Name getName() {
        return fullName;
    } // end getName

    public void setId(String studentId) {
        id = studentId;
    } // end setId

    public String getId() {
        return id;
    } // end getId

    public String toString() {
        return id + " " + fullName.toString();
    } // end toString

    public static void main(String[] args) {
        Name stud1 = new Name(" louis", " Doe");
        Student student1 = new Student(stud1, " B29384");
        Name stud2 = new Name(" Krishnasai", " Yakkala");
        Student student2 = new Student(stud2, " D293864");
        Name stud3 = new Name(" Ravindra", " reddy");
        Student student3 = new Student(stud3, " B29564");
        Name stud4 = new Name(" kmaois", " M");
        Student student4 = new Student(stud4, " B26454");

        System.out.println(" The student's information is : " + student1.toString());
        System.out.println(" The student's information is : " + student2.toString());
        System.out.println(" The student's information is : " + student3.toString());
        System.out.println(" The student's information is : " + student4.toString());

    } // end main

}// end Student