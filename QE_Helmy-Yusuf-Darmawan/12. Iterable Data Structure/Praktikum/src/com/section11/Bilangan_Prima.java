package com.section11;
import java.util.Scanner;
public class Bilangan_Prima {
    public static void main(String args[]) {
        // inisialisasi modul
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int numbers, checker = 0;

        // main Menu
        System.out.println("Check Bilangan Prima");
        System.out.print("masukan Angka: ");
        numbers = input.nextInt();

        System.out.println("-----------------------------");

        for (int i = 2; i <= numbers; i++) {
            if (numbers % i == 0) {
                checker++;
            }
        }
        if (checker == 1) {
            System.out.print(numbers + " merupakan bilangan prima");
        } else {
            System.out.println(numbers + " merupakan bukan bilangan prima");
        }
    }
}

