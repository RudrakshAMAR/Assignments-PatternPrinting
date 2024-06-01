package ASSIGNMENTS.PATTERN;

public class Q13 {
//          A
//        A B C
//      A B C D E
//    A B C D E F G
public static void main(String[] args) {
    for (int i=1;i<=4;i++){
        for(int k=0;k<4-i+1;k++){
            System.out.print("  ");
        }
        for(int j=1;j<=2*i-1;j++){
            char ch=(char) (j+64);
            System.out.print(ch+" ");
        }
        System.out.println();
    }
}
}
