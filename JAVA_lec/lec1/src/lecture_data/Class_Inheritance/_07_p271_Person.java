package lecture_data.Class_Inheritance;

public class _07_p271_Person {
    private String name;
    private int age;
    
    public _07_p271_Person(String name, int age){
        this.name = name;
        this.age = age;
    }
        
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return name + " : " + age;
    }

}
