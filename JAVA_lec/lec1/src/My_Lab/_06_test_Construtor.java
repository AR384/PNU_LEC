package My_Lab;

public class _06_test_Construtor {
    //Member Var
    String name;
    int age;
    String color;

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

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Constructor
    public _06_test_Construtor (String nam, int age,String color){
        this.name = nam;
        this.age = age;
        this.color = color;
    }
    //Static
    //instance를 생성하지 않아도 code 영역에 method에 접근을 가능하게 하는 영역을 선언해주는것
    //Static에 있는 선언은 Classname.method
}
