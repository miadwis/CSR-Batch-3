/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_sidang;

import java.util.Scanner;

/**
 *
 * @author mia
 */
class Sidang {
    private String npm;
    private String nama;
    private double nilai1;
    private double nilai2;
    private double nilai3;
 
    //contructor 1  
    public Sidang(){
        nama = " ";
        npm = " ";
        nilai1 = 0.0;
        nilai2 = 0.0;
        nilai3 = 0.0;
    }
    
    
    //input dalam
    public void inputNilai() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inputan dalam");
        System.out.println("");
        
        System.out.print("Masukkan nama anda : ");
        nama = input.nextLine();
        
        System.out.print("Masukkan npm anda : ");
        npm = input.nextLine();
        
        System.out.print("Masukkan nilai pembimbing : ");
        nilai1 = input.nextDouble();
        
        System.out.print("Masukkan nilai penguji 1 : ");
        nilai2 = input.nextDouble();
        
        System.out.print("Masukkan nilai penguji 2 : ");
        nilai3 = input.nextDouble();
        System.out.println("-------------------------");

    }
    
    //cetak dari dalam
    public void cetakNilai () {
        System.out.println("Nama             : "+nama);
        System.out.println("NPM              : "+npm);
        System.out.println("Nilai Pembimbing : "+nilai1);
        System.out.println("Nilai Penguji 1  : "+nilai2);
        System.out.println("Nilai Penguji 2  : "+nilai3);
        System.out.println("Total            : "+total());
        System.out.println("Huruf Mutu       : "+hm(total()));
    }
    
//fungsi hitung total    
      public double total(){
        double total;
        total = (0.4*nilai1)+(0.3*nilai2)+(0.3*nilai3);
        return total;
    }

//fungsi huruf mutu
       public String hm(double total){
        String hm = null;
        if ((total>80)&&(total<=100)){
            hm = "A";
        }
        else if ((total>70)&&(total<=80)){
            hm = "B";
        }
        else if ((total>60)&&(total<=70)){
            hm = "C";
        }
        else if ((total>=0)&&(total<=60)){
            hm = "D";
        }
        return hm;
        
    }

}
public class Oop_sidang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sidang sidang4 = new Sidang();
        sidang4.inputNilai();
        sidang4.cetakNilai();
    }
    
}
