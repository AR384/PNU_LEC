package lecture_data;
public class typecasting {
    public static void main(String[] args) {
        //형변환
        //정수에서 실수형으로 
        //실수에서 정수형으로
        
        //1. int socore = 93 + 98.8; java 기본값은 int 해결법은 뒤에 F를 붙이기
        //2. int -> float -> long -> double 은 자동 캐스팅
        //3. Double -> Long -> Float -> Int 는 직접 캐스팅 (type)변수
        
        int socore = 78;
        float socore_f = 93.8f; //1. 예시 
        double socore_d = 98.8;
        System.out.println(socore_d);
        System.out.println(socore_f);
        System.out.println((int)socore_d);
        
        //정수 실수 연산
        
        socore = 93 + (int) 78.8;
        System.out.println(socore);
        
        socore_d = 13.5 + 5 ; //2번 예시시
        System.out.println(socore_d);
        
        int convertedScoreInt = (int)socore_f; //3번 예시
        System.out.println("convert"+convertedScoreInt);
        
        //숫자를 문자열로
        
    }
}
