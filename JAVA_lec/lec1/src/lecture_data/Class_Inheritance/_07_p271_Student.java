package lecture_data.Class_Inheritance;

public class _07_p271_Student extends _07_p271_Person{
    
    private String major;
    
    public _07_p271_Student(String name, int age, String major){
        super(name, age);
        this.major = major;
    }
    
    public String getMajor() {
        //return this.major;
        return super.getName();
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
