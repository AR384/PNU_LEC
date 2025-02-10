package lecture_data.Class_Inheritance;

public class _07_p278_LMST {
    public static void main(String[] args) {
        _07_p269_Empoloee e = new _07_p269_Empoloee("hosnfg",222,"sales");
        _07_p270_Professor p = new _07_p270_Professor("honfg",22,"sales");
        _07_p271_Student s = new _07_p271_Student("honfg",22,"sales");
        
        // e.setAge(47);
        // e.setName("Unknown");
        // e.setDept("HR");
        
        // p.setAge(47);
        // p.setName("Unknown");
        // p.setSubject("Argriculture");
        
        // s.setAge(47);
        // s.setName("Unknown");   
        // s.setMajor("buisness");
        
        // System.out.println(e.getAge()+e.getName()+e.getDept());
        // System.out.println(e.toString());
        
        System.out.println(e.getAge());
        
        System.out.println(e.getName());
        System.out.println(e.getDept());
        
        System.out.println(e.toString());
        
    }
    
    
}
