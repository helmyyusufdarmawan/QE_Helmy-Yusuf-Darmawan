package com.volume;
import java.util.*;


class Kubus{
    float sisi;
    float VolumeKubus;

    void HitungVolumeKubus(){
        this.VolumeKubus = (this.sisi*this.sisi*this.sisi);
    }

}
class Balok{
    float panjang;
    float lebar;
    float tinggi;
    float VolumeBalok;

    void HitungVolumeBalok(){
        this.VolumeBalok = (this.panjang*this.lebar*this.tinggi);
    }
}

class Tabung{
    double jari;
    double tinggi;
    double VolumeTabung;

    void HitungVolumeTabung(){
        this.VolumeTabung = (3.14*(this.jari*this.jari)*this.tinggi);
    }
}

class UI{
    int pilihan;
    Scanner input;

    UI(Scanner input){
        this.input = input;
    }

    void StartUI(){
        this.InputBangunRuang();
        this.InputData();
    }
    void InputBangunRuang(){
        System.out.println(" MENGHITUNG LUAS DAN KELILING BANGUN DATAR\n");
        System.out.println("pILIH bangun ruang ?\n");
        System.out.println("1. Kubus\n");
        System.out.println("2. Balok\n");
        System.out.println("3. Tabung");
        System.out.println("Masukkan pilihan Anda: ");
        this.pilihan = this.input.nextInt();
    }

    void InputData(){
        if(this.pilihan==1){
            System.out.println("Masukkan sisi: ");
            var kubus = new Kubus();
            kubus.sisi = this.input.nextFloat();
            kubus.HitungVolumeKubus();
            System.out.println("Volume Kubus: " +kubus.VolumeKubus);
        }
        else if(this.pilihan==2){
            System.out.println("Masukkan panjang: ");
            var balok = new Balok();
            balok.panjang = this.input.nextFloat();
            System.out.println("Masukkan lebar: ");
            balok.lebar = this.input.nextFloat();
            System.out.println("Masukkan Tinggi: ");
            balok.tinggi = this.input.nextFloat();
            balok.HitungVolumeBalok();
            System.out.println("Volume Balok: " +balok.VolumeBalok);
        }
        else if(this.pilihan==3){
            System.out.println("Masukkan jari-jari: ");
            var tabung = new Tabung();
            tabung.jari = this.input.nextDouble();
            System.out.println("Masukkan tinggi: ");
            tabung.tinggi = this.input.nextDouble();
            tabung.HitungVolumeTabung();
            System.out.println("Volume Tabung: " +tabung.VolumeTabung);
        }
        else{
            System.out.println("Pilihan Anda tidak tersedia");
        }

    }
}
public class Problem2 {
    public static void main(String[] args) {
        var ui= new UI(new Scanner(System.in));
        ui.StartUI();
    }
}
