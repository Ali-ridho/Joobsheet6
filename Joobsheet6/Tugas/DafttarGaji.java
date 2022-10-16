package Tugas;

public class DafttarGaji{
    public pegawai[] listPegawai;
    public int InputPegawai;

    public DafttarGaji (int InputPegawai){
        listPegawai = new pegawai[InputPegawai];
    }

    public void addPegawai(pegawai pg){
        listPegawai [InputPegawai] = pg;
        InputPegawai++;
    }

    public void printSemuaGaji(){
        for (int i = 0; i < InputPegawai; i++ ){
             System.out.println("Nama : " + listPegawai[i].getnama());   
             System.out.println("Gaji : " + listPegawai[i].getGaji());
             System.out.println("");
        }  
    }



    

}