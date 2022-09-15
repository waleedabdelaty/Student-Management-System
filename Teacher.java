import java.util.ArrayList;
import java.util.Scanner;

public class Teacher  implements Person{
    String id;

    String name;

    String email;

    String mobileNumber;

    @Override
    public void start(Database database) {
        System.out.println("Login :Teacher");
        Scanner scanner = new Scanner(System.in);
        String inputString;
        System.out.println("To view Students Assigned Courses, enter 1\n" +
                "To get Students in Course, enter 2\n" +
                "To get All Assigned Courses, enter 3\n" +
                "To get Student Data, enter 4\n" +
                "To add Assignment, enter 5\n" +
                "To submit Students Attendance, enter 6\n");
        inputString = scanner.nextLine();
        if (inputString.equals("1"))
        {
            System.out.println("Student id: ");
            inputString = scanner.nextLine();
            this.viewStudentsAssignedCourses(inputString,database);
        }
        else if (inputString.equals("2"))
        {
            System.out.println("Course id: ");
            inputString = scanner.nextLine();
            this.getStudentsInCourse(inputString,database);
        }
        else if (inputString.equals("3"))
        {
            System.out.println("Teacher id: ");
            inputString = scanner.nextLine();
            this.getStudentsInCourse(inputString,database);
        }
        else if (inputString.equals("4"))
        {
            System.out.println("Student id: ");
            inputString = scanner.nextLine();
            this.getStudentData(inputString,database);
        }
        else if (inputString.equals("5"))
        {
            Assignment a = new Assignment();
            System.out.println("Assignment id: ");
            inputString = scanner.nextLine();
            a.setId(inputString);
            System.out.println("Assignment Description: ");
            inputString = scanner.nextLine();
            a.setDescription(inputString);
            System.out.println("Course ID: ");
            inputString = scanner.nextLine();
            a.setCourseId(inputString);
            System.out.println("Assignment Due Date: ");
            inputString = scanner.nextLine();
            a.setDueDate(inputString);


            this.addAssignment(a, database);
        }
        else if (inputString.equals("6"))
        {
            CourseAttendance c = new CourseAttendance();
            System.out.println("Attendance id: ");
            inputString = scanner.nextLine();
            c.setId(inputString);
            System.out.println("Student id: ");
            inputString = scanner.nextLine();
            c.setStudentId(inputString);
            System.out.println("Course ID: ");
            inputString = scanner.nextLine();
            c.setCourseId(inputString);
            System.out.println("Attendance Date: ");
            inputString = scanner.nextLine();
            c.setAttendanceDate(inputString);
            System.out.println("Attendance Status: ");
            inputString = scanner.nextLine();
            c.setStatus(inputString);


            this.submitStudentsAttendance(c, database);
        }
    }
    public void addTeacher(Teacher teacher1, Database database){}

    public void viewAllTeachers(Database database){}

    public void addStudent(Student obj, Database database){}


/*
    Teacher(){

    }
    Teacher(String id,String name,String email,String mobileNumber)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.mobileNumber=mobileNumber;
    }
*/
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


    public void viewStudentsAssignedCourses(String studentID,Database database){
        ArrayList<String>courses1=new ArrayList<String>();
        courses1=database.student_courses.get(studentID);
        for (String c:courses1)
        {
           // System.out.println("Student :"+studentID);
            System.out.println("Course ID :"+c);

        }


    }

    public void getStudentsInCourse(String  courseID,Database database){
        ArrayList<String>students1=new ArrayList<String>();
        students1=database.course_students.get(courseID);
        for (String s:students1)
        {
         //   System.out.println("Course ID :"+courseID);
            System.out.println("Student ID :"+s);

        }

    }

    public void viewAllCourses(Database database) {
        for (Course c : database.courses)
        {
            System.out.println("Course Name :"+c.getCourse_name());
            System.out.println("ID :"+c.getCid());


        }
    }

    public void getAllAssignedCourses(String teacherID,Database database){
        ArrayList<String>courses2=new ArrayList<String>();
        courses2=database.teacher_courses.get(teacherID);
        for (String c:courses2)
        {
            System.out.println("Course ID :"+c);
        }

    }

    public void getStudentData(String studentId,Database database){
        for (Student s :database.students)
        {
            if(studentId.equals(s.getId()))
            {
                System.out.println("Student Found");
                System.out.println(s.getId());
                System.out.println(s.getName());
                return;
            }

        }
        System.out.println("Student Not Found");


    }
    @Override
    public void viewAllStudents(Database database) {
        for (Student s : database.students)
        {
            System.out.println("ID :"+s.getId());
            System.out.println("Name :"+s.getName());

        }
    }
    public void addAssignment(Assignment assignment,Database database){
        database.assignments.add(assignment);
    }

    public void submitStudentsAttendance(CourseAttendance attendance,Database database){
        database.courseAttendances.add(attendance);  //Arraylist
    }
}
