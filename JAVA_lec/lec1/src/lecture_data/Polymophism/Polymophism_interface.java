package lecture_data.Polymophism;
import lecture_data.Class_Inheritance._07_p269_Empoloee;

public class Polymophism_interface extends _07_p269_Empoloee implements Messenger,Workfile {
    //
    public Polymophism_interface(String name, int age, String dept){
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
    public static void main(String[] args) {
        
    }
}
