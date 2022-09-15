import java.util.Date;

public class CourseAttendance {

    String id;

    String courseId;

    String studentId;

    String attendanceDate;

    String status;

    CourseAttendance(){

    }
    CourseAttendance(String id,String courseId,String studentId,String attendanceDate,String status){
        this.id=id;
        this.courseId=courseId;
        this.studentId=studentId;
        this.attendanceDate=attendanceDate;
        this.status=status;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getId() {
        return id;
    }

    public String getAttendanceDate() {
        return attendanceDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
