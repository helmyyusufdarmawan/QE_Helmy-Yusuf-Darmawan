import java.util.Scanner;

    import java.util.Scanner;
    class Problem{

        public static float panjang, lebar, tinggi, k, berat, hasil1, hasil2;

        public static float volber(float panjang, float lebar, float tinggi) {
            hasil1 = (panjang * lebar * tinggi);

            if(hasil1<50){
                hasil1 = 1;
            }
            else if(hasil1>50){
                hasil1=hasil1/50;
                Math.ceil(hasil1);
            }
            hasil2 = hasil1 * 5000;
            System.out.println("Dimensi Barang:   \n"+ hasil1);
            System.out.println("Ongkos Kirim Rp. " +hasil2);
            return 0;
        }

        public static void main(String[] args) {
            System.out.println("Menghitung Ongkos Kirim dengan Volumetrik\n");
            System.out.print("Masukan Panjang = ");
            panjang = sc.nextFloat(); //input panjang
            System.out.print("Masukan Lebar   = ");
            lebar = sc.nextFloat(); //input lebar
            System.out.print("Masukan Tinggi  = ");
            tinggi = sc.nextFloat(); //input tinggi
            System.out.print("Masukan Berat  = ");
            berat = sc.nextFloat(); //input tinggi

            volber(panjang, lebar, tinggi); //pemanggilan parameter untuk menghitung
        }

        public final static Scanner sc = new Scanner(System.in);
    }

    public class Problem4 {
        public static void main(String[] args) {
        }
    }

