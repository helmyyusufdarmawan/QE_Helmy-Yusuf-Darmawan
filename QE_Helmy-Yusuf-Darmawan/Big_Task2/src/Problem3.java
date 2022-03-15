import java.util.*;

public class Problem3 {

    public static void main(String[] args) {
        var ui = new Mobil(new Scanner(System.in));
        ui.Start();
    }
}
class Hewan{
    float berat;
}
class Mobil extends Hewan {
    Set<String> muatan = new HashSet<String>();
    float kapasitas;
    String muatanTambahan;
    // memanggil scanner dimanapun pada kelas mobil
    Scanner input;
    Mobil(Scanner input){
        this.input=input;
    }
    public void Start(){
        this.tambahMuatan();
    }
    public void tambahMuatan() {
        muatan.add("macan");
        System.out.print("Masukkan Sisa Kapasitas : ");
        kapasitas = input.nextFloat();
        System.out.print("Masukkan Nama Hewan : ");
        muatanTambahan = input.next();
        System.out.print("Masukkan Berat Hewan : ");
        berat = input.nextFloat();
        if (berat <= kapasitas) {
            muatan.add(muatanTambahan);
            System.out.println(muatan);
        }

    }
}
