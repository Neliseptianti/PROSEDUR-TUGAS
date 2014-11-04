package id_blitz_tugasprocedure;

public class MencariLuas {

    public static void main(String[] args) {
        PersegiPanjang cari1 = new PersegiPanjang();
        cari1.lebar = 8;
        cari1.panjang = 12;
        cari1.hitungLuasBangunDatar();
        
        Persegi cari2 = new Persegi();
        cari2.sisi = 8;
        cari2.hitungLuasBangunDatar();
        
        Segitiga cari3 = new Segitiga();
        cari3.alas = 8;
        cari3.tinggi = 7;
        cari3.hitungLuasBangunDatar();
        
        Lingkaran cari4 = new Lingkaran();
        cari4.r = 7;
        cari4.phi = (float) 3.14;
        cari4.hitungLuasBangunDatar();
        
        Trapesium cari5 = new Trapesium();
        cari5.jumlahsisisejajar = 10 ;
        cari5.tinggi = 4 ;
        cari5.hitungLuasBangunDatar();
    }
    
}
