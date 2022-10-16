package Tugas;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Gaji karyawan dan Dosen");
        System.out.println("");
        Dosen d = new Dosen("Harry Miguare", "2131710088", "Sumber Anyar");
        d.setSKS(8);

        Dosen d2 = new Dosen("makmur", "2131710099", "probolinggo");
        d.setSKS(9);

        Dosen d3 = new Dosen("ilham", "21317100001", "Pajrakan");
        d.setSKS(9);

        pegawai p = new pegawai("202020", "jamal", "Paiton");

        pegawai p2 = new pegawai("202021", "Dodik", "Paiton");

        pegawai p3 = new pegawai("202022", "Didik", "Paiton");

        DafttarGaji g = new DafttarGaji(6);

        g.addPegawai(d);
        g.addPegawai(d2);
        g.addPegawai(d3);
        
        g.addPegawai(p);
        g.addPegawai(p2);
        g.addPegawai(p3);
        g.printSemuaGaji();
    }
}
