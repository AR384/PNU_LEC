package lecture_data.Interface;
import lecture_data.Class_Inheritance._07_p269_Empoloee;

public class InterfaceInhritance extends _07_p269_Empoloee implements Messenger,Workfile {
    //
    public InterfaceInhritance(String name, int age, String dept){
        super(name, age, dept);
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public void setMessage(String msg) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void InnerWorkfile() {
        // TODO Auto-generated method stub
        
    }
}
