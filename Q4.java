package ASSIGNMENTS.PATTERN;

public class Q4 {
//    1
//    A B
//    1 2 3
//    A B C D
//    1 2 3 4 5
public static void main(String[] args) {
    for(int i=1;i<7;i++){
        for(int j=1;j<i;j++){
           if(i%2!=0){
               char ch=(char)(j+64);
               System.out.print(ch);
           }
           else{
               System.out.print(j);
           }
        }
        System.out.println();
    }
}
}
