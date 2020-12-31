public class TesSiswa {
    public static void main(String[] ar) {
        Siswa s = new Siswa(12345);

        s.nrp = 8030001;
        System.out.println(s.nrp);

        s.nrp = 8030002;
        System.out.println(s.nrp);
    }
}

/**
 * Kode program ini eror saat di jalankan karena butuh inisilisasi langsung akan
 * tetapi atribut nrpnya tidak memiliki akses public melainkan private dan
 * mengakibatkan error
 */