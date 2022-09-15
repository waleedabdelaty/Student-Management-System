import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Student  implements Person {
    String id;
    String name;
    String email;
    String mobileNumber;
    String age;
    String address;
    String gender;

    /*
    Student(){

    }

    Student(String id,String name,String email,String mobileNumber,String age,String address,String gender)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.mobileNumber=mobileNumber;
        this.age=age;
        this.address=address;
        this.gender=gender;
    }


     */
    @Override
    public void start(Database database) {
        System.out.println("Login :Student");
        Scanner scanner = new Scanner(System.in);
        String inputString;
        System.out.println("To view Enrolled Courses, enter 1\n" +
                "To view Assignments, enter 2\n" +
                "To submit Assignment, enter 3\n");
        inputString = scanner.nextLine();
        if (inputString.equals("1"))
        {
            System.out.println("Student id: ");
            inputString = scanner.nextLine();
            this.viewEnrolledCourses(inputString,database);
        }
        else if (inputString.equals("2"))
        {
            System.out.println("Course id: ");
            inputString = scanner.nextLine();
            this.viewAssignments(inputString,database);
        }
        else if (inputString.equals("3"))
        {
            AssignmentSubmission a = new AssignmentSubmission();
            System.out.println("Assignment id: ");
            inputString = scanner.nextLine();
            a.setAssignmentId(inputString);
            System.out.println("Student ID: ");
            inputString = scanner.nextLine();
            a.setStudentId(inputString);
            System.out.println("Course ID: ");
            inputString = scanner.nextLine();
            a.setCourseId(inputString);
            System.out.println("Assignment submission Date: ");
            inputString = scanner.nextLine();
            a.setSubmissionDate(inputString);
            System.out.println("Assignment Content submitted: ");
            inputString = scanner.nextLine();
            a.setAssignmentContentsubmitted(inputString);
            System.out.println("Assignment Marks: ");
            inputString = scanner.nextLine();
            a.setAssignmentMarks(Float.parseFloat(inputString));


            this.submitAssignment(a, database);
        }


    }
    public void addTeacher(Teacher teacher1, Database database){}

    public void viewAllTeachers(Database database){}

    public void addStudent(Student student, Database database){}

    public void viewAllStudents(Database database){}


    public void setId(String id) {
        this.id = id;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    public void viewEnrolledCourses(String studentID,Database database){
        ArrayList<String> courses3=new ArrayList<String>();
        courses3=database.student_courses.get(studentID);
        for (String c:courses3)
        {
            System.out.println("Course ID :"+c);
        }


    }


    public void viewAssignments(String CourseID,Database database){
        for (Assignment a:database.assignments)
        {
            if(a.getCourseId().equals(CourseID))
            {
                System.out.println("Assignment ID :"+a.getId());
                System.out.println("Description :"+a.getDescription());
                System.out.println("Course ID :"+a.getCourseId());
                System.out.println("Due Date :"+a.getDueDate());

            }
        }

    }

    public void submitAssignment(AssignmentSubmission assignmentSubmission, Database database){
        database.assignment_submissions.add(assignmentSubmission);

    }
}
