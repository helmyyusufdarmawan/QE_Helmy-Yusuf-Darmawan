import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Problem 1\n");
        System.out.print("Pilih Input : ");
        int n = input.nextInt();
        for (int a = 2; a <= n; a++){
            for (int b = 1; b <= a; b++) {
                System.out.print(' ');
            }
            for (int c = n; c >= a; c--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int a = 1; a <= n; a++){
            for (int b = n; b >= a; b--) {
                System.out.print(' ');
            }
            for (int c = 1; c <= a; c++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}