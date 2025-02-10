package lecture_data.Interface;

public interface Messenger {
    
    //인터페이스에 선언된 변수는 static 키워드, public 접근제어자에 관계없이 static final로 역할한다
    
    int MIN_SIZE = 1;    //public static final 컴파일시 자동 추가가
    static int AVG = 5;
    static final int  min_AVG = 1;
    public static final int MAX_SIZE = 104857600;
    
    
    public abstract String getMessage();
    
    public abstract void setMessage(String msg);
    // interface 에서 method에 default 와 static으로 선언할 경우 body를 가질수 있다.
    public default void setLogin(boolean Login){
        log();
        if (Login) {
            System.out.println("로그인처리합니다.");
            
        }
        else{
            System.out.println("로그아웃 처리합니다.");
        }
    }
    
    public static void getConnection(){
        
    }
    // interface 에서 method에 default 와 static으로 선언할 경우 body를 가질수 있다.
    //defalut의 경우 인터페이스를 사용하는 모든 클레스에서 공통으로 갖는 기능을 구현할 목적으로 사용
    /* 기존의 abstract 클래스로 선언하여 공통으로 사용하면 단일상속만 되는 자바
     * static 또한 instance 생성을 하지 않고 사용하기위해 컴파일시 미리 메모리에 로드함함
     * prviate 역역은 default영역에서 사용하기위해 사용됌됌
     */
    //public void log();{} <<<<--에러 : interface안에서는 default, static private를 제외하고는 바디를 생성할수 없음음
    public static void log(){}
    /* private void log(){
        
    } */
}
