package lecture_data;
import java.util.*;
import java.math.*;


class Car {

    String manufacturer;
    String model ;
    double weight;
    int length ; 
    int width ; 
    int speed ;
    
    Car(String manufacturer, String model, double weight, int length, int width, int speed){
        this.manufacturer = manufacturer;
        this.model = model;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.speed = speed;
        
    }
    
    String getSegment(){
        
        if (length<4200) {
            return "S-segment()";
        }
        else if (length >= 4200 && length < 4600){
            return "C-segment()";
        }
        else if(length >= 4600 && length < 4900){
            return "D-segment()";
        }
        else if(length >= 4900 && length < 5100){
            return "E-segment()";
        }
        else if(length >= 5100 ){
            return "F-segment()";
        }
        else{
            return "type is none";
        }
        
    }
    
    void checkSpeeding(int speedlimit){
        String carSpeed = (speed>speedlimit) ? "Warning speeding":"Right speeding";
        System.out.println(carSpeed);
    };
    
    void checkSpeeding(){
        String carSpeed = (speed>60) ? "Warning speeding":"Right speeding";
        System.out.println(carSpeed);
    };
    @Override
    public String toString(){
        return "제조사="+manufacturer+ ", 모델= "+model+", 중량= "+weight+", 전장= "+length+"전폭= "+width+", 속도= "+speed;
    };
    
    
}
    
public class _05_1_class {
	public static void main(String[] args) {
        // 자동차 객체 생성
        Car car1 = new Car("Hyundai", "Sonata", 1400,4600,1800, 95);
        Car car2 = new Car("BMW", "M3", 1200, 4500, 1700, 110);

        // 도로별 제한 속도 설정
        int cityLimit = 50;  // 도심 제한 속도
        int highwayLimit = 100; // 고속도로 제한 속도

        // 과속 여부 확인
        System.out.println("도심 주행 테스트:");
        car1.checkSpeeding(cityLimit); // 도심에서 주행
        car2.checkSpeeding(cityLimit);
        car1.checkSpeeding(); // method overloading
        car2.checkSpeeding(); // method overloading
        
        System.out.println("고속도로 주행 테스트:");
        car1.checkSpeeding(highwayLimit); // 고속도로에서 주행
        car2.checkSpeeding(highwayLimit);
        
        System.out.println("차량 크기 분류:");
        System.out.println(car1.getSegment());
        System.out.println(car2.getSegment());
        
        System.out.println("차량 객체의 출력:");
        System.out.println(car1);
        System.out.println(car2);
    }
}

