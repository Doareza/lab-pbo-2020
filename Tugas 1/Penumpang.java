public class Penumpang {
    private String nama;
    private int id;
    private int umur;
    private boolean hamil;
    private int saldo;

    public Penumpang(String nama, int id, int umur, boolean hamil) {
        this.nama = nama;
        this.id = id;
        this.umur = umur;
        this.hamil = hamil;
        saldo = 10000;
    }

    public int getID() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public int getUmur() {
        return this.umur;
    }

    public boolean getHamil() {
        return this.hamil;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public int tambahSaldo(int saldobaru) {
        this.saldo += saldobaru;
        return saldo;
    }

    public void kurangiSaldo(int ongkos) {
        saldo -= ongkos;
    }
}
