/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

public class KonversiSuhu {
    
    public static void main(String[] args) { 
          
          //Deklarasi
          Double hasil;
          int celcius;
          
          //Membuat Scanner Baru
          Scanner baca = new Scanner(System.in);
          
          //Input
          System.out.println("== Program hitung perubahan suhu Celcius ke Farenheit ==");
          System.out.print("Input celcius: ");
          celcius = baca.nextInt();
          
          //Proses
          hasil = Double.valueOf((9/5 * celcius) + 32);
          
          //Output
          System.out.println("Hasil = " + hasil);
          
      }
          
  }
    

