package lecture_data.Class_Inheritance;

public class _07_p269_Empoloee extends _07_p271_Person{
    private String dept;
    
    public _07_p269_Empoloee(String name, int age, String dept){
        super(name, age);
        this.dept = dept;
    }
    
    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    
    public String toString(){
        return super.getName()+super.getAge()+dept ;
    }

}
