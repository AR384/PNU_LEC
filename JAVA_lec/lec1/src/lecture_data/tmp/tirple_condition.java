package lecture_data.tmp;

public class tirple_condition
 {//삼항 연산자 type var = (condition) ? true:false;
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i < 100; i++) {
            sum += (i%2 == 0 ) ? i: 0;
        }
    }
}
