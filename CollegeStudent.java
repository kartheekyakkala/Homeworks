import Name;
public class CollegeStudent extends Student
{
    private int year; // year of graduation
    private String degree; // degree sought
   
    public CollegeStudent ()
    {
        super (); // must be first
        year = 0;
        degree = "";
    } // end default constructor


    public CollegeStudent (Name studentName, String studentId,
            int graduationYear, String degreeSought)
    {
        super (studentName, studentId); // must be first
        year = graduationYear;
        degree = degreeSought;
    } // end constructor


    public void setStudent (Name studentName, String studentId,
            int graduationYear, String degreeSought)
    {
        setName (studentName); // NOT fullName = studentName;
        setId (studentId); // NOT id = studentId;
        // or setStudent(studentName, studentId); (see Segment 2.21)
        year = graduationYear;
        degree = degreeSought;
    } // end setStudent
    
    // < The methods setYear, getYear, setDegree, and getDegree go here. >
    //     . . .
    public void setYear(int newYear){
        year = newYear;

    }

    public int getYear(){
        return year;
    }

    public void setDegree(String newDegree){
        degree = newDegree;
    }

    public String getDegree(){
        return degree;
    }
    /
    public String toString ()
    {
        return super.toString () + ", " + degree + ", " + year;
    } // end toString
    
    
    
   public static void main(String[] args){
   
   // testing the derived class here..
   Name stud1 = new Name("Krishna","Yakkala");
   CollegeStudent student1 = new CollegeStudent (stud1, "B1234",2022,"Computer science and Engineering");
   Name stud2 = new Name("Tom","Williams");
   CollegeStudent student2 =  new CollegeStudent(stud2,"A1234",2025,"Mechanical Engineering");
   Name stud3 = new Name("Jack","Wheelers");
   CollegeStudent student3 = new CollegeStudent(stud3,"A4234" , 2024, "Electrical Engineering");
   
    System.out.println(" The student's information is : " + student1.toString());
    System.out.println(" The student's information is : " + student2.toString());
    System.out.println(" The student's information is : " + student3.toString());

// GraduateStudent gstudent= new GraduateStudent( "  ", " "...);
// System.out.println(" ... " + gstudent.toString() );
   }// end of main
   
} // end CollegeStudent
