package lecture_data.Polymophism;

abstract class Employee {
    String name;
    int salary;
    
    public abstract void calcSalary();
    public abstract void calcBonus();
}

class Salesman extends Employee{
    int annual_sales;
    public void calcSalary(){
        System.out.println("Salesman 급여 = 기본급 + 판매수당");
    }
    public void calcBonus(){
        System.out.println("Salesman 보너스 = 기본급 *12*4");
    }
}

class Consultant extends Employee{
    int num_project;
    public void calcSalary(){
        System.out.println("Consultant 급여 = 기본급 + 판매수당");
    }
    public void calcBonus(){
        System.out.println("Consultant 보너스 = 기본급 *12*4");
    }
}
abstract class Manager extends Employee{
    int num_team;
    public void calcSalary(){
        System.out.println("Manager 급여 = 기본급 + 판매수당");
    }
}

class Director extends Manager{
    public void calcSalary(){
        System.out.println("Director 급여 = 기본급 + 판매수당");
    }
    public void calcBonus(){
        System.out.println("Director 보너스 = 기본급 *12*4");
    }
}

class A {}
class B extends A{} 
class C extends B{}


public class HRTest {
    public static void calcTax( Employee e){
        if (e instanceof Salesman) {
            Salesman s = (Salesman) e;
            s.annual_sales = 65;
            System.out.println("Salesman 입니다." +s.annual_sales);
            // System.out.println(e.); 에러
        }
        else if (e instanceof Manager){
            System.out.println("Manager 입니다.");
        }
        else if (e instanceof Consultant){
            System.out.println("Consultant 입니다.");
        }
        else{
            System.out.println("Employee 입니다.");
        }
        System.out.println("소득세를 계산합니다.");
    }
    
    public static void main(String[] args) {
        Employee dd = new Consultant();

        Salesman s = new Salesman();
        Consultant c = new Consultant();
        Director d = new Director();
        s.calcBonus();
        c.calcBonus();
        d.calcBonus();
        
        calcTax(d);
        calcTax(s);
        calcTax(s);
        
        System.out.println(s.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        
        

        
        if (s instanceof Salesman) {
            System.out.print("Salesman");
        }
    }

}
