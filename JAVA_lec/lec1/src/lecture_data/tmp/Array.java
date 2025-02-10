package lecture_data.tmp;
import java.math.*;
public class Array {
    public static void main(String[] args) {
        /*
         * 
         */
        /* for (int i = 0; i < range; i++) {
            arr [i] = 10*i;
            System.out.println("arr"+"["+i+"="+arr[i]);
        } */
        /* int j = 0;
        while (j <arr.length) {
            System.out.println(arr[j++]);
            if (j==10) {
                break;
            }
        } */
        int[] socore = {11,22,33,44,55};
        
        for (int i : socore) {
            
            int m = Math.max(i, i-1);
            System.out.println(i);
            System.out.println(m);
        }
        
        
    }
}
