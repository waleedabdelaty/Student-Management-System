import java.io.IOException;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  throws Exception  {
        System.out.println("        *** Student Management System ***       ");

        Database database = Database.getDatabase();
        while (true) {
            //Input Data
            System.out.println("Enter Your Account type (Admin/Teacher/Student) :");
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();

            PersonFactory personFactory = new PersonFactory();
            Person p1 = PersonFactory.getPerson(inputString);
            p1.start(database);
            System.out.println("Do You Want To Continue y/n ?:");
            String cont = scanner.nextLine();
            if (cont.equals("n")) {
                break;
            }
        }
        /*
        Teacher teacher1=new Teacher("1","Mostafa","M@ejada.com","011");
        Student student1=new Student("2","Walid","W@ejada.com","013","15","Rehab","M");
        Admin admin1= new Admin("3","Basem","B@ejada.com","012");
        Course course1 =new Course("4","Maths");
        Course course2 =new Course("5","English");
        Assignment assignment1=new Assignment("6","Algebra","4","2020-03-03");
        AssignmentSubmission assignmentSubmission1=new AssignmentSubmission("7","2","4","2020-03-07","Algebra",8.5f);
        CourseAttendance courseAttendance1=new CourseAttendance("8","4","2","2020-03-04","attended");
        Database database=new Database();

        //PersonFactory personFactory = new PersonFactory();
        //Person admin1 = PersonFactory.getPerson("Admin");
        //Person student1 = (PersonFactory.getPerson("Student");

        //admin1.start("3","Basem","B@ejada.com","012","","","");
        //student1.start("2","Walid","W@ejada.com","013","15","Rehab","M");


        //Demonstrate Classes

        System.out.println("                   ~Teachers~          ");
        admin1.addTeacher(teacher1,database);
        admin1.viewAllTeachers(database);

        System.out.println("                   ~Students~          ");
        admin1.addStudent( student1,database);
        admin1.viewAllStudents(database);

        teacher1.viewAllStudents(database);
        teacher1.getStudentData("2",database);


        System.out.println("                   ~Courses~          ");
        admin1.addCourses(course1,database);
        admin1.addCourses(course2,database);
        admin1.addCourseToStudent(student1,course1.getCid(),database);
        admin1.addStudentToCourse(course1, student1.getId(), database);
        admin1.addCourseToStudent(student1,course2.getCid(),database);
        admin1.addStudentToCourse(course2, student1.getId(), database);
        teacher1.viewAllCourses(database);
        teacher1.viewStudentsAssignedCourses(student1,database);
        teacher1.getStudentsInCourse(course1,database);

        System.out.println("                   ~Assignments~          ");
        teacher1.addAssignment(assignment1,database);
        student1.viewAssignments("4",database);

        System.out.println("                   ~Assignment Submission~          ");
        student1.submitAssignment(assignmentSubmission1,database);

        System.out.println("                   ~Course Attendance~          ");
        teacher1.submitStudentsAttendance(courseAttendance1,database);



 */
        System.out.println("Thank You!");

    }
}