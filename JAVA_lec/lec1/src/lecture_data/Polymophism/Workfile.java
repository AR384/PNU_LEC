package lecture_data.Polymophism;

public interface Workfile {
    
    public void InnerWorkfile ();
    
    
    
    public static int sum(){
        return 0;
    }
    
    default String say(){
        
        return null;
    }
    
    
}
