import java.util.*;

public class Bus {
    Scanner scan = new Scanner(System.in);

    private ArrayList<Penumpang> penumpangBiasa;
    private ArrayList<Penumpang> penumpangPrioritas;
    private ArrayList<Penumpang> penumpangBerdiri;
    private int ongkosBus;
    private int totalPendapatan;

    public Bus() {
        penumpangBiasa = new ArrayList<Penumpang>();
        penumpangPrioritas = new ArrayList<Penumpang>();
        penumpangBerdiri = new ArrayList<Penumpang>();
        totalPendapatan = 0;
    }

    public ArrayList<Penumpang> getPenumpangBiasa() {
        for (Penumpang penumpang : penumpangBiasa) {
            penumpang.getNama();
        }
        return penumpangBiasa;

    }

    public ArrayList<Penumpang> getPenumpangPrioritas() {
        for (Penumpang penumpang : penumpangPrioritas) {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }

    public ArrayList<Penumpang> getPenumpangBerdiri() {
        for (Penumpang penumpang : penumpangPrioritas) {
            penumpang.getNama();
        }
        return penumpangBerdiri;
    }

    public int getJumlahPenumpangBiasa() {
        int jumlahPenumpangBiasa = penumpangBiasa.size();
        System.out.println("Jumlah penumpang Biasa yaitu " + jumlahPenumpangBiasa);
        return jumlahPenumpangBiasa;

    }

    public int getJumlahPenumpangPrioritas() {
        int jumlahPenumpangPrioritas = penumpangPrioritas.size();
        System.out.println("Jumlah penumpang Prioritas " + jumlahPenumpangPrioritas);
        return jumlahPenumpangPrioritas;
    }

    public int getJumlahPenumpangBediri() {
        int jumlahPenumpangBerdiri = penumpangBerdiri.size();
        System.out.println("Jumlah penumpang Berdiri yaitu " + jumlahPenumpangBerdiri);
        return jumlahPenumpangBerdiri;
    }

    public boolean naikPenumpang(Penumpang penumpang){
        if ((penumpangPrioritas.size() < 4) && (penumpang.getUmur() < 10 || penumpang.getUmur() > 60) || (penumpang.getHamil() == true) ) {
            System.out.println("Penumpang Dengan Nama " + penumpang.getNama() + " Berhasil Ditambahkan");
            return penumpangPrioritas.add(penumpang);
        } else if (penumpangBiasa.size() < 16){
            System.out.println("Penumpang Dengan Nama " + penumpang.getNama() + " Berhasil Ditambahkan");
            return penumpangBiasa.add(penumpang);
          else if(penumpangBerdiri.size() < 20 ){ 
            System.out.println("Penumpang dengan nama " + penumpang.getNama() + " Berhasil Ditambahkan\n");
            return penumpangBerdiri.add(penumpang);
        
        } else {
            System.out.println("Penumpang Dengan Nama " + penumpang.getNama() + "Gagal Ditambahkan Dikarenakan Kursi Tidak Tersedia");
            return false;
        }
    }

    public boolean turunkanPenumpang(String nama) {
        for (int i = 0; i < penumpangBiasa.size(); i++) {
            if (nama.equals(penumpangBiasa.get(i).getNama())) {
                penumpangBiasa.remove(i);
                System.out.println("Penumpang Berhasil Diturunkan");
                return penumpangBiasa.equals(nama);
            } else {
                System.out.println("Tidak Ada Penumpang Yang Bernama " + nama);
                return false;
            }
        }

        for (int i = 0; i < penumpangPrioritas.size(); i++) {
            if (nama.equals(penumpangPrioritas.get(i).getNama())) {
                penumpangPrioritas.remove(i);
                System.out.println("Penumpang Berhasil Diturunkan");
                return penumpangPrioritas.equals(nama);
            } else {
                System.out.println("Tidak Ada Penumpang Yang Bernama " + nama);
                return false;
            }
        }

        for (int i = 0; i < penumpangBerdiri.size(); i++) {
            if (nama.equals(penumpangBerdiri.get(i).getNama())) {
                penumpangBerdiri.remove(i);
                System.out.println("Penumpang Berhasil Diturunkan");
                return penumpangBerdiri.equals(nama);
            } else {
                System.out.println("Tidak Ada Penumpang Yang Bernama " + nama);
                return false;
            }
        }
        return penumpangPrioritas.equals(nama);
    }

    public int countpenumpang() {
        return penumpangBiasa.size() + penumpangPrioritas.size() + penumpangBerdiri.size();
    }

    public String toString() {
        String namaPenumpangBiasa = " ", namaPenumpangPrioritas = " ";
        boolean check1 = penumpangBiasa.isEmpty();
        boolean check2 = penumpangPrioritas.isEmpty();
        boolean check3 = penumpangBerdiri.isEmpty();

        for (Penumpang penumpang : penumpangBiasa) {
            namaPenumpangBiasa += penumpang.getNama().toString();
        }
        for (Penumpang penumpang : penumpangPrioritas) {
            namaPenumpangPrioritas += penumpang.getNama().toString();
        }
        for (Penumpang penumpang : penumpangBerdiri) {
            namapenumpangBerdiri += penumpang.getNama().toString();
        }

        if (check1 == true) {
            System.out.println("Penumpang Biasa");
        } else {
            System.out.println("daftar Nama Penumpang Biasa = " + namaPenumpangBiasa);
        }

        if (check2 == true) {
            System.out.println("Penumpang Prioritas");
        } else {
            System.out.println("daftar Nama Penumpang Prioritas = " + namaPenumpangPrioritas);
        }

        if (check2 == true) {
            System.out.println("Penumpang Berdiri");
        } else {
            System.out.println("daftar Nama Penumpang Berdiri = " + namaPenumpangBerdiri);
        }

        System.out.println("jumlah Semua Penumpang Adalah = " + penumpangBiasa.size() + penumpangPrioritas.size()
                + penumpangBerdiri.size());
        System.out.println("\n");

        return "daftar nama penumpang biasa = " + namaPenumpangBiasa + "daftar nama penumpang prioritas = "
                + namaPenumpangPrioritas + "daftar nama penumpang berdiri = " + namaPenumpangBerdiri
                + "jumlah semua penumpang = " + penumpangBiasa.size() + penumpangPrioritas.size()
                + penumpangBerdiri.size();
    }

}
