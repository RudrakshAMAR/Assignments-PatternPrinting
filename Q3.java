package ASSIGNMENTS.PATTERN;

public class Q3 {
//    A
//    A B
//    A B C
//    A B C D
public static void main(String[] args) {
    for(int i=0;i<5;i++){
        for(int j=0;j<i;j++){
            char ch=(char)(j+65);
            System.out.print(ch);
        }
        System.out.println();
    }
}
}
