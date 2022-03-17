package com.luaskeliling;
import java.util.*;
import java.lang.Math;


class Persegi{
    private float _sisi;
    float getSisi(){
        return this._sisi;
    }
    void setSisi(float value) {
        this._sisi=value;
        this.HitungLuasPersegi();
        this.HitungKelilingPersegi();
    }
    float LuasPersegi;
    float KelilingPersegi;
    void HitungLuasPersegi(){

        this.LuasPersegi = this._sisi*this._sisi;
    }

    void HitungKelilingPersegi(){
        this.KelilingPersegi =  4*this._sisi;
    }
}

class Segitiga{ //class
    //properties
    double alas;
    double tinggi;
    double SisiMiring;
    double LuasSegitiga;
    double KelSegitiga;

    //method (function dalam class disebut method)
    void HitungLuasSegitiga(){
        this.LuasSegitiga =(this.alas*this.tinggi)/2;
    }

    void HitungSisiMiring(){
        this.SisiMiring =Math.sqrt((this.alas*this.alas)+(this.tinggi*this.tinggi));
    }
    void HitungKelilingSegitiga(){
        this.KelSegitiga = this.SisiMiring+this.alas+this.tinggi;
    }
}

class persegiPanjang{
    float panjang;
    float lebar;
    float LuasPersegiPanjang;
    float KelPersegiPanjang;

    void HitungLuasPersegiPanjang(){
        this.LuasPersegiPanjang=this.panjang*this.lebar;
    }
    void HitungKelilingPersegiPanjang(){
        this.KelPersegiPanjang=2*(this.panjang+this.lebar);
    }

}
class UI{
    int pilihan;
    Scanner input;
    UI(Scanner input){
        this.input = input;
    }
    void StartUI(){
        this.InputBangunDatar();
        this.InputData();
    }
    void InputBangunDatar(){
        System.out.println(" MENGHITUNG LUAS DAN KELILING BANGUN DATAR\n");
        System.out.println("Pilih bangun datar?\n");
        System.out.println("1. Persegi\n");
        System.out.println("2. Segitiga\n");
        System.out.println("3. Persegi Panjang");
        System.out.println("Masukkan pilihan : ");
        this.pilihan = this.input.nextInt();
    }

    void InputData(){
        if(this.pilihan==1){
            System.out.println("Masukkan sisi: ");
            var persegi = new Persegi();
            persegi.setSisi(this.input.nextFloat());
            System.out.println("Luas Persegi adalah: " +persegi.LuasPersegi);
            System.out.println("Keliling Persegi adalah: " +persegi.KelilingPersegi);
        }
        else if(this.pilihan==2){
            System.out.println("Masukkan alas: ");
            var segitiga = new Segitiga(); //instantiate
            // segitiga -> object, Segitiga() -> function
            segitiga.alas = this.input.nextDouble();
            System.out.println("Masukkan tinggi: ");
            segitiga.tinggi = this.input.nextDouble();
            segitiga.HitungLuasSegitiga();
            segitiga.HitungSisiMiring();
            segitiga.HitungKelilingSegitiga();
            System.out.println("Luas Segitiga adalah: " +segitiga.LuasSegitiga);
            System.out.println("Keliling Segitiga adalah: " +segitiga.KelSegitiga);
        }
        else if(this.pilihan == 3){
            System.out.println("Masukkan panjang: ");
            var persegipanjang = new persegiPanjang();
            persegipanjang.panjang = this.input.nextFloat();
            System.out.println("Masukkan lebar: ");
            persegipanjang.lebar = this.input.nextFloat();
            persegipanjang.HitungLuasPersegiPanjang();
            persegipanjang.HitungKelilingPersegiPanjang();
            System.out.println("Luas Persegi Panjang adalah: " +persegipanjang.LuasPersegiPanjang);
            System.out.println("Keliling Persegi Panjang adalah: " +persegipanjang.KelPersegiPanjang);
        }
        else {
            System.out.println("Pilihan Anda tidak sesuAI");
        }
    }

}

public class Problen1 {
    public static void main(String[] args) {
        var ui= new UI(new Scanner(System.in));
        ui.StartUI();
    }


}
