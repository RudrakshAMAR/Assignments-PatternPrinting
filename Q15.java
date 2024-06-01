package ASSIGNMENTS.PATTERN;

import java.sql.SQLOutput;

public class Q15 {
//    A B C D E F G
//    A B C   E F G
//    A B       F G
//    A           G
public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
        for (int j = 0; j <= 4 - i; j++) {
            char ch = (char) (j + 65);
            System.out.print(ch);
        }
        for (int k = 1; k <(2*i)-1; k++) {
            System.out.print("*");
        }
        for(int h=i+1;h<6;h++){
            char ch = (char) (h + 67);
            System.out.print(ch);
        }
        System.out.println();
    }
}
}
