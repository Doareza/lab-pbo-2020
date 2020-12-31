public class Siswa1 {
    private int nrp;
    private String nama;

    public Siswa1() {
        this.nrp = 12345;
        this.nama = "nama default";
    }

    public Siswa1(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public int getNrp() {
        return this.nrp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }
}

/**
 * kode program ini semua method diberikan atau sudah ada hak akses public dan
 * sudah diterapkan di keyword this
 */
