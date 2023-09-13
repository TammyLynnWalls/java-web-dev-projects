public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below

        Student newStudent = new Student("Tammy Walls", 12345, 1, 4.0);

        System.out.println("Student Name: " + newStudent.getName());
        System.out.println("Student Id: "+ newStudent.getStudentId());
        System.out.println("Student Credits: "+ newStudent.getNumberOfCredits());
        System.out.println("Student GPA: "+ newStudent.getGpa());
    }
}
