/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import java.util.Scanner;

/**
 *
 * @author alfizainulhaq
 */



public class BangunRuang {

    public static void main(String[] args) {
        try ( // Menggunakan Scanner secara standar (lebih mudah dipahami)
                Scanner input = new Scanner(System.in) // Menutup scanner dengan aman
        ) {
            System.out.print("Masukkan sisi disini: ");
            int sisi = input.nextInt();

            int luasKubus = 6 * (sisi * sisi);
            int volumeKubus = sisi * sisi * sisi;
            int kelilingKubus = 12 * sisi;

            System.out.println("Luasnya adalah : " + luasKubus);
            System.out.println("Volumenya adalah : " + volumeKubus);
            System.out.println("Keliling adalah : " + kelilingKubus);

        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        }
    }
}