package My_Lab;
import java.util.*;
class Calc {

    private int [] calcdata;
    
    public void setRow(int [] calcdata) {
        this.calcdata = calcdata;
    }

    public void multical(){

        // Sectioin line generator
        for (int i = 1; i < calcdata[0]*11; i++) {
            System.out.print("="); 
        }
        System.out.println();
        
        //Naming N of multicarc
        int op = (calcdata[1]+calcdata[3])-1; //<<<<<------------------------Main Logic Key
        
        for (int i = calcdata[1]; i < calcdata[2]+1; i++) {
            System.out.print("Muti Table"+i+" ");
            if (op>calcdata[2]) {
                op=calcdata[2];
            }
            if(i==op){// <<<<------Line change
                System.out.println();
                
                for (int j = 1; j < 10; j++) {
                    for (int j2 = calcdata[1]; j2 <= calcdata[2]; j2++) {
                        System.out.print(j2+"*"+j+"="+j2*j);
                        if (j2*j>=10&&j2*j<=99) {
                            calcdata[4]=6;
                        }
                        else if (j2*j>=100) {
                            calcdata[4]=5;
                        }else{
                            calcdata[4]=7;
                        }
                        
                        for (int k = 0; k < calcdata[4]; k++) {
                            System.out.print(" ");
                        }
                        if (j2==op) {
                            System.out.println();
                            break;
                        }
                        // if (j==9) {
                        //     op += calcdata[3];
                        // }
                        continue;
                    }
                    
                }
                
                calcdata[1]= calcdata[1]+calcdata[3];
                op = (calcdata[1] +calcdata[3])-1;
                if (op>calcdata[2]) {
                    op=calcdata[2];
                }
            }
            
            continue;
        }
        System.out.println();
        
        
    }
}


public class _07_test_class {
    public static void main(String[] args) {
        
        //Make instance
        Calc matcalc = new Calc();
        Scanner sc = new Scanner(System.in);
        int [] calcdata;
        int arrData;
        
        //input row, space , result indivisually and allocate array
        System.out.println("How many data you need? Max is 5");
        arrData = sc.nextInt();
        
        //call input data and print
        System.out.println("You insert "+arrData +" of array ");
        
        //prevent arr indexing error 
        if (arrData>0&&arrData<=5) {
            
            //insert arry num
            calcdata = new int[arrData];
            
            //formating component(array elements)
                for (int i = 0; i < calcdata.length; i++) {
                    if (i==0) {
                        System.out.println("Enter the Display line length ");
                        calcdata[i] = sc.nextInt();
                    }
                    else if(i==1){
                        System.out.println("Enter the Display Min");
                        calcdata[i] = sc.nextInt();
                    }
                    else if(i==2){
                        System.out.println("Enter the Display Maxr");
                        calcdata[i] = sc.nextInt();
                    }
                    else if(i==3){
                        System.out.println("Enter the Display Col");
                        calcdata[i] = sc.nextInt();
                    }
                    else if(i==4){
                        System.out.println("Enter the Display Space");
                        calcdata[i] = sc.nextInt();
                    }
                    else{
                        break;
                    }
            }
            //***************************Print muticalculation Table**************************
            matcalc.setRow(calcdata);
            matcalc.multical();
        }
        else{
            System.out.println("You`re range is out of range");
        }
        
        
        //print calc data
        // matcalc.setRow(row, space, result);
    }
    
    
}

