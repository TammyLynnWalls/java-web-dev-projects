public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String aName){
        firstName = aName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String aLastName){
        lastName = aLastName;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String aSubject){
        subject = aSubject;
    }
    public int getYearsTeaching(){
        return yearsTeaching;
    }
    public void setYearsTeaching(int aYearsTeaching){
        yearsTeaching = aYearsTeaching;
    }

}
