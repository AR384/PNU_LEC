package lecture_data.Class_Inheritance;

public class _07_p270_Professor extends _07_p271_Person {
    
    private String subject;
    
    public _07_p270_Professor(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String Subject) {
        this.subject = Subject;
    }

}
