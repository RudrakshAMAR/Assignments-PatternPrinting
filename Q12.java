package ASSIGNMENTS.PATTERN;

public class Q12 {
//                  1
//                1 2 3
//              1 2 3 4 5
//            1 2 3 4 5 6 7
public static void main(String[] args) {
    for(int i=1;i<5;i++){
        for(int k=1;k<5-i+1;k++){
            System.out.print("  ");
        }
        for(int j=1;j<=(2*i-1);j++){
            System.out.print(j+" ");
        }

        System.out.println();
    }
}
}
