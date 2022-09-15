import java.util.ArrayList;
import java.util.Scanner;

public class Admin implements Person {

    String id;
    String name;
    String email;
    String mobileNumber;


    @Override
    public void start(Database database) {
        System.out.println("Login :Admin");
        Scanner scanner = new Scanner(System.in);
        String inputString;
        System.out.println("To add a student, enter 1\n" +
                "To remove a student, enter 2\n" +
                "To add a teacher, enter 3\n" +
                "To remove a teacher, enter 4\n" +
                "To view all students, enter 5\n" +
                "To view all teachers, enter 6\n" +
                "To view a certain teacher's details, enter 7\n" +
                "To view a certain student's details, enter 8\n" +
                "To update a certain teacher's details, enter 9\n" +
                "To update a certain student's details, enter 10\n"+
                "To Add Course, enter 11\n"+
                "To Assign Course to Student, enter 12\n");
        inputString = scanner.nextLine();
        if (inputString.equals("1"))
        {
            Student st = new Student();
            System.out.println("Student id: ");
            inputString = scanner.nextLine();
            st.setId(inputString);
            System.out.println("Student name: ");
            inputString = scanner.nextLine();
            st.setName(inputString);
            System.out.println("Student email: ");
            inputString = scanner.nextLine();
            st.setEmail(inputString);
            System.out.println("Student mobile number: ");
            inputString = scanner.nextLine();
            st.setMobileNumber(inputString);
            System.out.println("Student age: ");
            inputString = scanner.nextLine();
            st.setAge(inputString);

            this.addStudent(st, database);

            this.viewAllStudents(database);

        }
        else if (inputString.equals("2"))
        {
            Student st = new Student();
            System.out.println("Student id: ");
            inputString = scanner.nextLine();
            st.setId(inputString);
            System.out.println("Student name: ");
            inputString = scanner.nextLine();
            st.setName(inputString);
            System.out.println("Student email: ");
            inputString = scanner.nextLine();
            st.setEmail(inputString);
            System.out.println("Student mobile number: ");
            inputString = scanner.nextLine();
            st.setMobileNumber(inputString);
            System.out.println("Student age: ");
            inputString = scanner.nextLine();
            st.setAge(inputString);

            this.removeStudent(st, database);

            this.viewAllStudents(database);
        }
        else if (inputString.equals("3"))
        {
            Teacher t = new Teacher();
            System.out.println("Teacher id: ");
            inputString = scanner.nextLine();
            t.setId(inputString);
            System.out.println("Teacher name: ");
            inputString = scanner.nextLine();
            t.setName(inputString);
            System.out.println("Teacher email: ");
            inputString = scanner.nextLine();
            t.setEmail(inputString);
            System.out.println("Teacher mobile number: ");
            inputString = scanner.nextLine();
            t.setMobileNumber(inputString);


            this.addTeacher(t, database);

            this.viewAllTeachers(database);

        }
        else if (inputString.equals("4"))
        {
            Teacher t = new Teacher();
            System.out.println("Teacher id: ");
            inputString = scanner.nextLine();
            t.setId(inputString);
            System.out.println("Teacher name: ");
            inputString = scanner.nextLine();
            t.setName(inputString);
            System.out.println("Teacher email: ");
            inputString = scanner.nextLine();
            t.setEmail(inputString);
            System.out.println("Teacher mobile number: ");
            inputString = scanner.nextLine();
            t.setMobileNumber(inputString);


            this.removeTeacher(t, database);

            this.viewAllTeachers(database);
        }
        else if (inputString.equals("5"))
        {
            this.viewAllStudents(database);

        }
        else if (inputString.equals("6"))
        {
            this.viewAllTeachers(database);

        }
        else if (inputString.equals("7"))
        {
            System.out.println("Teacher id: ");
            inputString = scanner.nextLine();
            this.viewTeacherDetails(inputString,database);

        }
        else if (inputString.equals("8"))
        {
            System.out.println("Student id: ");
            inputString = scanner.nextLine();
            this.viewStudentDetails(inputString,database);

        }
        else if (inputString.equals("9"))
        {
            System.out.println("Teacher id: ");
            inputString = scanner.nextLine();
            System.out.println("New Teacher id: ");
            String newID = scanner.nextLine();
            System.out.println("New Teacher name: ");
            String newName = scanner.nextLine();
            System.out.println("New Teacher Email: ");
            String newEmail = scanner.nextLine();
            System.out.println("New Teacher Mobile Number: ");
            String newMobile = scanner.nextLine();

            this.updateTeacherData(inputString,newID,newName,newEmail,newMobile,database);
        }
        else if (inputString.equals("10"))
        {
            System.out.println("Student id: ");
            inputString = scanner.nextLine();
            System.out.println("New Student id: ");
            String newID = scanner.nextLine();
            System.out.println("New Student name: ");
            String newName = scanner.nextLine();
            System.out.println("New Student Email: ");
            String newEmail = scanner.nextLine();
            System.out.println("New Student Mobile Number: ");
            String newMobile = scanner.nextLine();
            System.out.println("New Student Age : ");
            String newAge = scanner.nextLine();
            System.out.println("New Student Address: ");
            String newAddress = scanner.nextLine();
            System.out.println("New Student Gender: ");
            String newGender = scanner.nextLine();

            this.updateStudentData(inputString,newID,newName,newEmail,newMobile,newAge,newAddress,newGender,database);
        }
        else if (inputString.equals("11"))
        {
            Course c = new Course();
            System.out.println("Course id: ");
            inputString = scanner.nextLine();
            c.setCid(inputString);
            System.out.println("Course name: ");
            inputString = scanner.nextLine();
            c.setCourse_name(inputString);

            this.addCourses(c,database);
        }
        else if (inputString.equals("12"))
        {
            System.out.println("Student id: ");
            String studentID = scanner.nextLine();
            System.out.println("Course id: ");
            String courseID = scanner.nextLine();

            this.addCourseToStudent(studentID,courseID,database);
            this.addStudentToCourse(courseID,studentID,database);

        }

    }

    /*
    Admin(){

    }

    Admin(String id,String name,String email,String mobileNumber)
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

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void addTeacher(Teacher teacher,Database database) {
        database.teachers.add(teacher);

    }

    public void removeTeacher(Teacher teacher,Database database) {
        database.teachers.remove(teacher);

    }
    @Override
    public void viewAllTeachers(Database database) {
        for (Teacher t : database.teachers)
        {
            System.out.println("ID :"+t.getId());
            System.out.println("Name :"+t.getName());

        }

    }

    @Override
    public void addStudent(Student student, Database database) {
        database.students.add(student);
    }

    public void viewTeacherDetails(String teacherID,Database database) {
      for (Teacher t:database.teachers)
      {
          if(t.getId().equals(teacherID))
          {
              System.out.println("ID :" + t.getId());
              System.out.println("Name :" + t.getName());
              System.out.println("Email :" + t.getEmail());
              System.out.println("Mobile :" + t.getMobileNumber());

              return;
          }

      }

    }

    public void updateTeacherData(String teacherID, String id, String name, String email, String mobileNumber,Database database) {
        for (Teacher t:database.teachers)
        {
            if (t.getId().equals(teacherID))
            {
                t.setId(id);
                t.setName(name);
                t.setMobileNumber(mobileNumber);
                t.setEmail(email);
            }
        }
    }


    public void removeStudent(Student student,Database database) {
        database.students.remove(student);

    }

    @Override
    public void viewAllStudents(Database database) {
        for (Student s : database.students)
        {
            System.out.println("ID :"+s.getId());
            System.out.println("Name :"+s.getName());

        }
    }

    public void viewStudentDetails(String studentID,Database database) {
        for (Student s:database.students)
        {
            if(s.getId().equals(studentID))
            {
                System.out.println("ID :" + s.getId());
                System.out.println("Name :" + s.getName());
                System.out.println("Email :" + s.getEmail());
                System.out.println("Mobile :" + s.getMobileNumber());

                return;
            }

        }
    }

    public void updateStudentData(String studentID, String id, String name, String email, String mobileNumber, String age, String address, String gender,Database database) {
        for (Student s:database.students)
        {
            if (s.getId().equals(studentID))
            {
                s.setId(id);
                s.setName(name);
                s.setMobileNumber(mobileNumber);
                s.setEmail(email);
                s.setAge(age);
                s.setAddress(address);
                s.setGender(gender);
            }
        }


    }


    public void addCourses(Course course,Database database)
    {
        database.courses.add(course);
    }

    public void addCourseToStudent(String studentID,String cid, Database database){
        if(!database.student_courses.containsKey(studentID))
        {
            database.student_courses.put(studentID, new ArrayList<String>());
        }
        database.student_courses.get(studentID).add(cid);

    }
    public void addStudentToCourse(String courseID,String student_id, Database database){
        if(!database.course_students.containsKey(courseID))
        {
            database.course_students.put(courseID, new ArrayList<String>());
        }
        database.course_students.get(courseID).add(student_id);

    }
    public void addCourseToTeacher(String teacherID,String cid, Database database){
        if(!database.teacher_courses.containsKey(teacherID))
        {
            database.teacher_courses.put(teacherID, new ArrayList<String>());
        }
        database.teacher_courses.get(teacherID).add(cid);

    }
}

