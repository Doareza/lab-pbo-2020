public class TesSiswa1 {
    public static void main(String[] ar) {
        Siswa1 s = new Siswa1();
        Siswa1 ss = new Siswa1(8030001, "Upin");

        // ini akan menimbulkan error
        // Siswa sss = new Siswa(8030002);

        System.out.println(s.getNrp() + "  " + s.getNama());
        System.out.println(ss.getNrp() + "  " + ss.getNama());

        System.out.println(s);
        System.out.println(ss);
    }
}
/**
 * menampilkan output berupa : 12345 nama default 8030001 Upin Siswa1@51016012
 * Siswa1@29444d75
 * 
 * objek yang diciptakan pada baris pertama dan kedua berhasil dicetak namun
 * pada baris selanjutnya dicetak alamat dari objeknya karena objek tidak bisa
 * diprint.
 */