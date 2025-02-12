package My_Lab;

public class _04_test_array {
    public static void main(String[] args) {
        int [][] word = {{1,2},{3,4}};
        int [] a ;
        int [] b= {1,2};
        int c = 0;
        
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length; j++) {
                
                System.out.print(word[i][j++]);
                System.out.print(" ");
                if (j==word.length-1) {
                    System.out.println();
                }
                else{
                    continue;
                }

                
                
            }
        }
    System.out.println(word);
    
        for (int i = 0; i < ++c; i++) {
            a = new int[c];
            a[i]=b[i];
            if (b.length-1==i) {
                break;
            }
        }
        
    }

}
