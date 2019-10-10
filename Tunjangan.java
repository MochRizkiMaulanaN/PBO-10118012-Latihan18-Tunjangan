/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunjangan;

import java.util.Scanner;

/**
 * Nama : Moch Rizki Maulana N
 * Kelas : IF-1/S1/III
 * NIM : 10118012
 * Deskripsi Program:
 *
 * @author LENOVO
 */
public class Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("======== Program Tunjangan ========");
        System.out.print("Nama\t\t\t : ");
        String nama = input.next();
        System.out.print("Gaji Pokok/bulan\t : Rp ");
        int gajipokok = input.nextInt();
        System.out.print("Status?(Menikah/Belum)\t : ");
        String status = input.next();
        
        double tunjangan,totalgaji;
        if(status.equalsIgnoreCase("menikah") || status.equalsIgnoreCase("Menikah")){
            tunjangan = gajipokok * 35/100;
            totalgaji = gajipokok + tunjangan;
        }else{
            tunjangan = 0;
            totalgaji = gajipokok + tunjangan;
        }
        
        System.out.println("");
        System.out.println("======== Hasil Perhitungan Gaji Anda ========");
        System.out.println("Gaji Pokok\t : Rp "+gajipokok);
        System.out.println("Tunjangan\t : Rp "+tunjangan);
        System.out.println("Total Gaji\t : Rp "+totalgaji);
        System.out.println("( Develoved by : Moch Rizki Maulana N )");
    }
    
}
