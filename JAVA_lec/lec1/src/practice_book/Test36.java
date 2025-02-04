package practice_book;

public class Test36 {
    public static void main(String[] args) {
        
        char letter ='A';
        char [] alpabet = new char[26];
        
        for (int i = 0; i < alpabet.length; i++) {
            alpabet[i] = (char) (letter+i);
        }
        
        for (char c : alpabet) {
            System.out.println(c);            
        }
        
    }

}
