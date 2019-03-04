/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg5;

class barang{
    String nama;
    int harga,jumlah, total;
    
    void gettotal(int jumlah, int harga){
        
        this.jumlah= jumlah;
        this.harga= harga;
        total = jumlah* harga;
    }
    
    String getbonus (int total){
        this.total = total;
        if (total >=500000 && jumlah >5){
            nama="Setrika";
        }
        else if (total >=100000 && jumlah >3){
            nama="Payung";
        }
        else if (total >=50000 || jumlah >2){
            nama="ballpoint";
        }
        else{
            nama="blonjo meneh bos, gen entuk bonus";
        }
        return nama;
    }
    
    void cetaknota (){
        System.out.println("\njumlah barang   : "+jumlah);
        System.out.println("harga barang    : "+harga);
        System.out.println("total pembelian : "+total);
        System.out.println("bonus           : "+getbonus(total));
    }
    
}

public class penjualan {
    public static void main(String[] args){
        
        barang barangku = new barang();
        barang barangmu = new barang();
        
        barangmu.gettotal(2, 200000);
        barangmu.cetaknota();
        
        barangku.gettotal(5, 100000);
        barangku.cetaknota();
    }
    
}
