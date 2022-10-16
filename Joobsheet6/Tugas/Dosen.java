package Tugas;

 public class Dosen extends pegawai{
    public int jumlah_SKS;
    public int Tarif_SKS = 100000;

    public Dosen (String nama, String nip, String Alamat){
        super(nip,nama,Alamat);
    }

    public void setSKS(int SKS){
        this.jumlah_SKS = SKS;
    }

    public int getSKS(){
        return jumlah_SKS;
    }

    public int getGaji(){
        int Total = jumlah_SKS * Tarif_SKS;
        return Total+super.getGaji();
    }
 }