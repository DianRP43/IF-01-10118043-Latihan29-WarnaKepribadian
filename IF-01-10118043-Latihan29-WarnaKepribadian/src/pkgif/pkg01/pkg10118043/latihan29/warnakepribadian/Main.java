/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan29.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    private static final String Reset = "\033[0m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            String nama, warna;
        
        System.out.println((char)27+"[01;31m YUK"+(char)27+"[01;32m CEK"+(char)27+"[01;33m KEPRIBADIANMU"+(char)27+"[01;36m DARI"+(char)27+"[01;35m WARNA"+(char)27+"[01;34m FAVORITMU"+Reset);
        System.out.println((char)27+"[01;00;41m MERAH\t");
        System.out.println((char)27+"[01;00;42m HIJAU\t");
        System.out.println((char)27+"[01;00;43m KUNING\t");
        System.out.println((char)27+"[01;00;44m BIRU\t");
        System.out.println((char)27+"[01;00;45m UNGU\t"+Reset);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.print("PILIH WARNA FAVORIT MU : ");
        warna = scan.nextLine().toUpperCase();
        System.out.print("NAMA KAMU              : ");
        nama = scan.nextLine();
        System.out.println("");
        if (warna.equals("MERAH")) {
            System.out.println("Hasil TEST KEPRIBADIAN  "+nama+Reset);
            System.out.println("Warna Favorit mu adalah "+(char)27+"[01;31m Merah"+Reset);
            System.out.println("1. ");
            System.out.println("2. ");            
        }else if (warna.equals("HIJAU")){
            System.out.println("Hasil TEST KEPRIBADIAN  "+nama+Reset);
            System.out.println("Warna Favorit mu adalah "+(char)27+"[01;32m Hijau"+Reset);
            System.out.println("1. ");
            System.out.println("2. ");            
        }else if (warna.equals("KUNING")){
            System.out.println("Hasil TEST KEPRIBADIAN  "+nama+Reset);
            System.out.println("Warna Favorit mu adalah "+(char)27+"[01;33m Kuning"+Reset);
            System.out.println("1. ");
            System.out.println("2. ");    
        }else if (warna.equals("BIRU")){
            System.out.println("Hasil TEST KEPRIBADIAN  "+nama+Reset);
            System.out.println("Warna Favorit mu adalah "+(char)27+"[01;34m Biru"+Reset);
            System.out.println("1. ");
            System.out.println("2. ");            
        }else if (warna.equals("UNGU")){
            System.out.println("Hasil TEST KEPRIBADIAN  "+nama+Reset);
            System.out.println("Warna Favorit mu adalah "+(char)27+"[01;35m Ungu"+Reset);
            System.out.println("1. ");
            System.out.println("2. ");    
        }else{
            System.out.println("WARNA TIDAK ADA!");
        }
    }
    
}
