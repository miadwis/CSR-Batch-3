/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_oop;

import java.util.Scanner;

/**
 *
 * @author mia
 */
class travel{
    int tiket, harga, jumlah, bayar, kembali;
    String  nama, jurusan, jenis;
    Scanner input = new Scanner(System.in);
    
    public travel(){
        nama="";
        jurusan="";
        jenis="";
        tiket=0;
        harga=0;
        jumlah=0;
        bayar=0;
        kembali=0;
    }
    
    public void menu(){
        System.out.println("=================================================");
        System.out.println("             =                Jenis              ");
        System.out.println("  Jurusan    =        AC      =====    Non AC    ");
        System.out.println("=================================================");
        System.out.println("   Banten    =      90.000    =====    70.000   =");
        System.out.println("   Semarang  =      85.000    =====    60.000   =");
        System.out.println("   Jogja     =      60.000    =====    40.000   =");
        System.out.println("=================================================");
        
    }
    
    public void input(){
        
        System.out.print("Nama Pemesan  : ");
        nama= input.nextLine();
        System.out.print("Jurusan       : ");
        jurusan= input.nextLine();
        System.out.print("Jenis         : ");
        jenis= input.nextLine();
        System.out.print("Banyak Tiket  : ");
        tiket= input.nextInt();
    }
    
    public int harga(){
        switch(jurusan){
            case "Banten" :
                if ("AC".equals(jenis))
                {
                    harga=90000;
                }
                else
                {   harga=70000;
                }
            break;
            case "Semarang" :
                if ("AC".equals(jenis))
                {
                    harga=85000;
                    }
                else
                {   harga=60000;
                    }
                        
            break;
            case "Jogja" :
                if ("AC".equals(jenis))
                {
                    harga=60000;
                    }
                else
                {   harga=40000;
                    }
            break;
            default :
                harga=0;
            break;
            
        }
        return harga;
    }
    
    public int total(){
        jumlah=harga*tiket;
        return jumlah;
    }
    
    public void output(){
        harga();
        System.out.println("Harga satuan untuk jurusan "+jurusan+" adalah "+harga);    
        System.out.println("=================================================");
        total();
        System.out.println(nama+" harus membayar sebesar         "+jumlah);
        input_bayar();
        kembalian();
        System.out.println("=================================================");
        System.out.println("kembalian                          "+kembali);
    }
    
    public void input_bayar(){
        System.out.print("Masukkan jumlah uang               ");
        bayar= input.nextInt();
    } 
    
    public int kembalian(){
        kembali = bayar-jumlah; 
        return kembali;
    }
    
    public String pilihan(){
        System.out.print("Ulang lagi [Y/N]?");
        return input.next();
    }
}
public class Travel_oop {

    public static void main(String[] args) {
        String pilihan;
        
        do{
            travel tr = new travel();
            tr.menu();
            tr.input();
            tr.output();
            pilihan = tr.pilihan();
        } while ("Y".equals(pilihan));
    }
}
