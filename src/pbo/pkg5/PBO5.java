/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg5;

class data {
    String nim, nama, predikat;
    
    float Uts, Tugas, Uas, pNUts, pNTugas, pNUas, nilaiakhir;
    char nhuruf;

    void hitungNilai (float Tugas, float Uts , float Uas){
       
        this.Tugas=Tugas;
        this.Uts=Uts;
        this.Uas=Uas;
        pNUts = Uts *35 /100;
        pNTugas = Tugas *20 /100;
        pNUas = Uas * 45 /100;
        nilaiakhir = pNUts + pNTugas + pNUas;

    }
    
    char gethuruf(float nilaiakhir){
        if (nilaiakhir >= 85){
            nhuruf='A';
        }
        else if(nilaiakhir >=70 && nilaiakhir <85){
            nhuruf ='B';
        }
        else if(nilaiakhir >=60 && nilaiakhir<70){
            nhuruf='C';
        }
        else if(nilaiakhir>=40 && nilaiakhir<60){
            nhuruf='D';
        }
        else{
            nhuruf='E';
        }
        return nhuruf;
    }

    String getpredikat(char nhuruf){
        switch (nhuruf){
            case 'A': predikat="Apik"; break;
            case 'B': predikat="Baik"; break;
            case 'C': predikat="Cukup"; break;
            case 'D': predikat="Dablek"; break;
            default : predikat="Elek";
        }
        return predikat;
            
    }

    
    void cetakNilai (String nim, String nama){
        
        System.out.println("\nNim         : " +nim);
        System.out.println("Nama        : " +nama);
        System.out.println("Nilai Tugas : "+Tugas+" 20%   : " +pNTugas);
        System.out.println("Nilai Uts   : "+Uts+" 35%   : " +pNUts);
        System.out.println("Nilai Uas   : "+Uas+" 40%   : " +pNUas);
        System.out.println("Nilai Akhir : " +nilaiakhir);
        System.out.println("Huruf       : " +gethuruf(nilaiakhir));
        System.out.println("predikat    : " +getpredikat(nhuruf));
        
    }
}



public class PBO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        data mahasiswa1 = new data();
         data mahasiswa2 = new data();
         
         mahasiswa1.hitungNilai(80, 90, 87);
         mahasiswa1.cetakNilai("09269" , "Lendra");
         
         mahasiswa2.hitungNilai(75, 90, 50);
         mahasiswa2.cetakNilai("09270", "sora");
    }
    
}
