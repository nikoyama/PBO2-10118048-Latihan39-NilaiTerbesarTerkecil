/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan39.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan nilai mahasiswa yang terbesar dan terkecil
 */
public class NilaiMahasiswa {
    
    public int[] nilai;
    public int n, maks, min; // n = banyak mahasiswa 
    public String np;   // np = nama petugas

    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("=====Program Nilai Terbesar dan Terkecil "
                + "Nilai Mahasiswa=====" + "\nMasukkan Nama Petugas : ");
        np = scanner.next();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scanner.nextInt();
        nilai = new int[n];
        for (int i = 0;i < n; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " = ");
            nilai[i] = scanner.nextInt();
        }
    }
    
    public void cariMaksMin () {
        maks = nilai[0];
        min = nilai[0];
        for (int i = 0;i < n; i++) {
            if (nilai[i] > maks) 
                    maks = nilai[i];
            else { 
                    min=nilai[i];
            }
        }
            System.out.println("\nNilai Terbesar adalah " +maks);
            System.out.println("Nilai Terkecil adalah " +min);
    }
    
    public void tampilHasil() {
        System.out.println("\n=====HASIL NILAI MAHASISWA=====");
        for (int i = 0;i < n; i++) { 
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " = " + nilai[i]);
        }
        cariMaksMin();
        System.out.println("\nPetugas : " +np);
    }
}
