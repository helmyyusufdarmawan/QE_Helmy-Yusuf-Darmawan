package com.kalkulator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double angkapertama, angkakedua, hasil;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Masukkan angka pertama");
        angkapertama = input.nextDouble();

        System.out.println("Masukkan angka kedua");
        angkakedua = input.nextDouble();

        switch (operator) {

            // tambah
            case '+':
                hasil = angkapertama + angkakedua;
                System.out.println("Penjumlahan");
                System.out.println(angkapertama + " + " + angkakedua + " = " + hasil);
                break;

            // kurang
            case '-':
                hasil = angkapertama - angkakedua;
                System.out.println("Pengurangan");
                System.out.println(angkapertama + " - " + angkakedua + " = " + hasil);
                break;

            // kali
            case '*':
                hasil = angkapertama * angkakedua;
                System.out.println("Perkalian");
                System.out.println(angkapertama + " * " + angkakedua + " = " + hasil);
                break;

            // bagi
            case '/':
                hasil = angkapertama / angkakedua;
                System.out.println("Pembagian");
                System.out.println(angkapertama + " / " + angkakedua + " = " + hasil);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
