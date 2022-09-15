public class PersonFactory {

    public static Person getPerson(String PersonType){
        if(PersonType == null){
            return null;
        }
        if(PersonType.equalsIgnoreCase("Admin")){
            return new Admin();

        } else if(PersonType.equalsIgnoreCase("Teacher")){
            return new Teacher();

        } else if(PersonType.equalsIgnoreCase("Student")){
            return new Student();
        }

        return null;
    }
}
