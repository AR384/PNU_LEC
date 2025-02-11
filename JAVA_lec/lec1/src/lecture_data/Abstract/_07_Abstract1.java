package lecture_data.Abstract;

public abstract class _07_Abstract1 {
    String name ;
    public void getName(){
        
    }
    // public abstract void setName();

}

abstract class A {
    public A( int e ){
        
    }
    public void a() {
        System.out.println(" n");
    }
    abstract void m();
}

class B extends A {
    
    public B(){
        super(0);
    }
    @Override
    public void a() {
        // TODO Auto-generated method stub
        super.a();
    }
    @Override //의미 없음음
    void m() {
        // TODO Auto-generated method stub
        
    }
}

