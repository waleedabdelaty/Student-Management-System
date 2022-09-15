import java.util.Date;

public class AssignmentSubmission {

    String assignmentId;

    String studentId;

    String courseId;

    private Date Today;
    String submissionDate;

    String assignmentContentsubmitted;

    float assignmentMarks = 0.0F;

    AssignmentSubmission(){

    }
    AssignmentSubmission(String assignmentId,String studentId,String courseId,String submissionDate,String assignmentContentsubmitted,float assignmentMarks){
    this.assignmentId=assignmentId;
    this.studentId=studentId;
    this.courseId=courseId;
    this.submissionDate=submissionDate;
    this.assignmentContentsubmitted=assignmentContentsubmitted;
    this.assignmentMarks=assignmentMarks;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setAssignmentContentsubmitted(String assignmentContentsubmitted) {
        this.assignmentContentsubmitted = assignmentContentsubmitted;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public void setAssignmentMarks(float assignmentMarks) {
        this.assignmentMarks = assignmentMarks;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public void setToday(Date today) {
        Today = today;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public float getAssignmentMarks() {
        return assignmentMarks;
    }

    public Date getToday() {
        return Today;
    }

    public String getAssignmentContentsubmitted() {
        return assignmentContentsubmitted;
    }

    public String getStudentId() {
        return studentId;
    }


}
