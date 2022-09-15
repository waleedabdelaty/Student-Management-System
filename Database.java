import java.util.ArrayList;
import java.util.HashMap;

public class Database {

    //create an object of SingleObject
    private static Database databaseObject = new Database();

    //make the constructor private so that this class cannot be
    //instantiated
    private Database(){}

    //Get the only object available
    public static Database getDatabase(){
        return databaseObject;
    }

     ArrayList<Student> students=new ArrayList<Student>();
     ArrayList<Teacher> teachers=new ArrayList<Teacher>();
     ArrayList<Course> courses=new ArrayList<Course>();

     ArrayList<Assignment> assignments=new ArrayList<Assignment>();

     ArrayList<AssignmentSubmission> assignment_submissions=new ArrayList<AssignmentSubmission>();

     ArrayList<CourseAttendance> courseAttendances=new ArrayList<CourseAttendance>();

     HashMap<String,ArrayList<String>> student_courses= new HashMap<>();

     HashMap<String,ArrayList<String>> course_students= new HashMap<>();

     HashMap<String,ArrayList<String>> teacher_courses= new HashMap<>();
}
