package practice_book;

public class Teat38 {
    public static void main(String[] args) {
        
        int [][] arr = new int[3][4];
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = num ++;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }
        //확장for문으로 수정
        
        for (int[] n : arr) {
            for (int n2 : n) {
                System.out.print(n2+" '");
            }
            System.out.println();
        }
    }

}
