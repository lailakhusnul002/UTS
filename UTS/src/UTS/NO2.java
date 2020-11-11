/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class NO2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        char predikat;
        
        System.out.print("Masukkan Nama Mahasiswa= ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jurusan= ");
        String jurusan = scanner.nextLine();
        System.out.print("Masukkan Semester= ");
        int semester = scanner.nextInt();
        System.out.println();
        
        System.out.println("Kode MK: MK-OOP");
        System.out.println("Nama MK: OOP");
        System.out.print("Masukkan Nilai= ");
        int oop = scanner.nextInt();
        System.out.println();
        
        System.out.println("Kode MK: MK-BS");
        System.out.println("Nama MK: Basis Data");
        System.out.print("Masukkan Nilai= ");
        int basisdata = scanner.nextInt();
        System.out.println();
        
        System.out.println("Kode MK: MK-Jarkom");
        System.out.println("Nama MK: Jaringan Komputer");
        System.out.print("Masukkan Nilai= ");
        int jarkom = scanner.nextInt();
        
        //Menghitung IPK
        int totalnilai= oop+basisdata+jarkom;
        System.out.println("=====================");
        System.out.println("Total Nilai="+totalnilai);
        System.out.println("=====================");
        float ipk= totalnilai/3;
        
        
        if (ipk >= 81) {
            predikat = 'A';
        } else if (ipk >= 61) {
            predikat = 'B';
        } else {
            predikat = 'C';
        }
        System.out.println(""+nama);
        System.out.println("Jurusan "+jurusan);
        System.out.println("Semester "+semester);  
        System.out.println("Nilai IPK Anda adalah "+ipk);
        System.out.println("Nilai Predikat Anda adalah " + predikat);
    }
}
