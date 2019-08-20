/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
 
import java.util.Scanner;

public class LuasSegitiga {
   public static void main(String[] args) {
       // deklarasi
       Double Luas;
       int alas, tinggi;
       
       // membuat scanner baru
       Scanner baca = new Scanner(System.in);
       
       // Input
       System.out.println("== Program hitung luas Segitiga ==");
       System.out.print("Input alas: ");
       alas = baca.nextInt();
       System.out.print("Input tinggi: ");
       tinggi = baca.nextInt();
       
       // proes
       Luas = Double.valueOf((alas * tinggi) / 2);
       
       // output
       System.out.println("Luas = " + Luas);
   }}

       
       
   

  
