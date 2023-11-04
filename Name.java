//Author:Krishna sai yakkala
public class Name
{
    private String first; // first name
    private String last; // last name

    public Name ()
    {
        first = "";
        last = "";
    } // end default constructor


    public Name (String firstName, String lastName)
    {
        first = firstName;
        last = lastName;
    } // end constructor


    public void setName (String firstName, String lastName)
    {
        setFirst (firstName);
        setLast (lastName);
    } // end setName


    public String getName ()
    {
        return toString ();
    } // end getName


    public void setFirst (String firstName)
    {
        first = firstName;
    } // end set First


    public String getFirst ()
    {
        return first;
    } // end getFirst


    public void setLast (String lastName)
    {
        last = lastName;
    } // end setLast


    public String getLast ()
    {
        return last;
    } // end getLast


    public void giveLastNameTo (Name aName)
    {
        aName.setLast (last);
    } // end giveLastNameTo


    public String toString ()
    {
        return first + " " + last;
    } // end toString


// client starts here

  public static void main(String[] args){

    Name name1 = new Name("krishnasai", "Yakkala");
    Name name2 = new Name("ramu", "roi");
    Name name3 = new Name("kumar", "Yakkala");
    Name name4 = new Name("hari", "sai");

 System.out.println(name1.toString());
 System.out.println(name2.toString());
 System.out.println(name3.toString());
 System.out.println(name4.toString());

  } // end of main



} // end Name
