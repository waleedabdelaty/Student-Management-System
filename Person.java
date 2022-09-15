public interface Person {
    void start(Database database);

    void addTeacher(Teacher teacher1, Database database);

    void viewAllTeachers(Database database);

    void addStudent(Student student, Database database);

    void viewAllStudents(Database database);
}
