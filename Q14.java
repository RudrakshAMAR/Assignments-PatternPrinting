package ASSIGNMENTS.PATTERN;

public class Q14 {
//          A
//        B A B
//      C B A B C
//    D C B A B C D
public static void main(String[] args) {
    for (int i=1;i<=4;i++){
        for(int k=0;k<4-i+1;k++){
            System.out.print("  ");
        }
        for(int j=i;j>1;j--){
            char ch=(char) (j+64);
            System.out.print(ch+" ");
        }
        for(int j=1;j<=i;j++){
            char ch=(char) (j+64);
            System.out.print(ch+" ");
        }
        System.out.println();
    }

}
}
