package My_Lab;

public class test4_array {
    public static void main(String[] args) {
        String [][] word = new String[1][9];
        String tag = "wood";
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length; j++) {
                word[i][j] = tag + j;
                System.out.println(word[i][j]);
            }
        }
    
    }

}
