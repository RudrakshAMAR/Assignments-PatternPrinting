package ASSIGNMENTS.PATTERN;

public class Q6 {
//            ******
//            * *
//            * *
//            ******
public static void main(String[] args) {
    for(int i=0;i<5;i++){
        if (i==0||i==4){
            for(int j=0;j<6;j++){
                System.out.print("*");
            }
        }
        else{
            for(int j=0;j<2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
}
