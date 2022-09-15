import java.util.Date;

public class Assignment {
    String id;

    String description;

    String courseId;

    String dueDate;

    Assignment(){

    }
    Assignment(String id,String description,String courseId,String dueDate){
    this.id=id;
    this.description=description;
    this.courseId=courseId;
    this.dueDate=dueDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }


}

