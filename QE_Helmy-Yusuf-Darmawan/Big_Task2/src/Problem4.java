import java.util.*;
public class Problem4 {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int hasilbaris = 0;
            int hasilkolom = 0;

            int[][] myNumbers = {{'A', 'B', 'C', 'D', 'E' }, {'F', 'G', 'H', 'I', 'J' }, {'L', 'M', 'N', 'O', 'P' }, {'Q', 'R', 'S', 'T', 'U' }, {'V', 'W', 'X', 'Y', 'Z' }};
            char huruf = input.nextLine().toUpperCase().charAt(0);
            for(int baris = 0; baris < myNumbers.length; ++baris){
                for(int kolom = 0; kolom < myNumbers[baris].length; ++kolom){
                    if(huruf == myNumbers[baris][kolom]){
                        hasilbaris = baris;
                        hasilkolom = kolom;

                    }
                }
            }
            System.out.print(hasilkolom + 1 + " " + (hasilbaris + 1));


        }
    }
