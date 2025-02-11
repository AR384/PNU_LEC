package exam.B1;

public class Customer {

    private String cname;
    private String city;
    private int age;
    
    public Customer (Customer c){
        cname = c.getCname();
        city = c.getCity();
        age = c.getAge();
    }
    
    public Customer (String cname, String city, int age){
        this.cname = cname;
        this.city = city;
        this.age = age;
    }

    public String getCname() {
        return this.cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void show() {
        System.out.println( "Name : " + cname + " City : " + city + " age : " + age);
    }
}
