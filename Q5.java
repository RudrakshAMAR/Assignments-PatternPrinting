package ASSIGNMENTS.PATTERN;

public class Q5 {
//            *
//            **
//            ***
//            ****
//            ***
//            **
//            *
public static void main(String[] args) {
    for(int i=0;i<8;i++){
       if(i<5){
           for(int j=0;j<i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       else{
           for(int j=1;j<(8+1)-i;j++){
               System.out.print("*");
           }
           System.out.println();

       }
    }

}
}
