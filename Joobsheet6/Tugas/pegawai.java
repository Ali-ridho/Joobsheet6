package Tugas;

public class pegawai {
    public String nip;
    public String nama;
    public String Alamat;

    public pegawai (String nip, String nama, String Alamat){
        this.nip = nip;
        this.nama = nama;
        this.Alamat = Alamat;

    }
   
    public void setnama(String nama){
        this.nama = nama;
    }

    public String getnama(){
        return nama;
    }

    public int getGaji(){
        return 10000000;
    }   
    
}
