package ASSIGNMENTS.PATTERN;

public class Q16 {
//            1 2 3 4 3 2 1
//            1 2 3   3 2 1
//            1 2       2 1
//            1           1
public static void main(String[] args) {
    for (int i = 4; i >= 1; i--) {
        for (int j = 1; j <= 4; j++) {
            if (j > i) {
                System.out.print(" ");
            } else {
                System.out.print(j);
            }
        }
        for (int j = 4; j >= 1; j--) {
            if (j > i) {
                System.out.print(" ");
            } else {
                System.out.print(j);
            }
        }
        System.out.println();
    }
}
}
