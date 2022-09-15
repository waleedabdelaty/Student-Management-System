public class Course {

    String cid;

    String course_name;

    Course(){

    }

    Course(String cid,String course_name){
        this.cid=cid;
        this.course_name=course_name;
    }
    public String getCid() {

        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_name() {
        return course_name;
    }
}
