/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array2Dimensi;

/**
 *
 * @author alfizainulhaq
 */
import java.util.Scanner;

public class Array1Dimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5]; // membuat array dengan 5 elemen

        // Menginput nilai ke dalam array
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }

        System.out.println("\nData yang dimasukkan:");

        // Menampilkan isi array
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + " = " + nilai[i]);
        }
    }
}