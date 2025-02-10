package lecture_data.Abstract;

abstract class Employee{
    String name;
    int salary;
    
    public abstract void calcSalary();//바디를 가질수 없다.
    //public abstract void csl(); 하나 이상의 추상 메서트가 존재해야한다.
    // 새로운 메서드 선언시 자식은 이를 완성해야할 의무를 지닌다. 
    // 즉 상속시 오버라이딩을 해야함
    // new를 통한 인스턴스 생성이 불가능함 왜? 메서드를 완성하지 않았기 때문
    //
}

class Salesman extends Employee {
    public void calcSalary(){
        System.out.println("Salesman 급여 = 기본급 + 판매수당");
    }
}
class Consultant extends Employee{
    public void calcSalary(){
        System.out.println("Consultant 급여 = 기본급 + 특별별수당");
    }
}
class Manager extends Consultant{
    public void calcSalary(){
        
    }
}



public class _07_p303_Abstract {
    public static void main(String[] args) {
        Salesman s = new Salesman();
        Consultant e = new Consultant();
        Manager c = new Manager();
        
        s.calcSalary();
    }
}
