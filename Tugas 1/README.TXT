PENJELASAN

1.  Class Penumpang
•   Class ini mewakili entitas penumpang bus
•   Satu objek penumpang mewakili satu penumpang
•   Setiap penumpang mempunyai attribut nama, umur, dan status hamil
•   Method Penumpang() merupakan method constructor yang akan memberikan nilai awal kepada attribute.
•   Method getNama(), getUmur(), dan getHamil() adalah method accessor yang mengembalikan nilai yang diminta.

2.  Class Bus
•   Class ini mewakili bus
•   Class ini memiliki attribute berupa objek dari Class Penumpang
•   Attribute penumpangBasa berisi penumpang biasa (minimal 0, maksimal 4)
•   Attribute penumpangPrioritas berisi penumpang prioritas (minimal 0, maksimal 2)
•   Anda boleh menggunakan Struktur data Array ataupun ArrayList untuk menampung data penumpang.
•   Method getPenumpang….() mengembalikan list penumpang yang diminta.
•   Method getJumlahPenumpang….() mengembalikan jumlah penumpang yang diminta.
•   Method NaikPenumpang() berfungsi untuk menambahkan penumpang ke dalam Bus (jika ada kursi untuk penumpang tsb). 
•   Method ini mengembalikan true jika penumpang berhasil naik dan menambahkan penumpang tsb ke dalam Array penumpang, dan mengembalikan false jika penumpang tidak bias naik.
    Note : ikuti aturan penumpang seperti hasil observasi di atas,
•   Method turunkanPenumpang(nama) menerima parameter nama penumpag. Jika nama penumpang ditemukan, maka hapus penumpang tersebut dari Array penumpang dan kembalikan nilai true. Sebaliknya, kembalikan false.
•   Method  toString()  untuk  mencetak  daftar  nama  Penumpang  Biasa,  Penumpang Prioritas, dan Jumlah semua penumpang.

3.  Class Main
•   Pada method main() dideklarasikan sebuah objek Bus. Pada method ini anda akan mensimulasikan proses naik dan turunnya penumpang dari bus.


INSTALISASI

$ cd Tugas 1

$ ls
  Bus.java
  Penumpang.java
  Main.java

*//Compile
$javac Bus.java
$javac Penumpang.java
$javac Main.java

*//Run
$java Bus
$java Penumpang
$java Main


Run The Program
1. langkah awal kita membuka apk BlueJ
2. kemudian membuat kode dari soal yang telah diberikan yaitu class Main.java, Penumpang.java
   dan Bus.java
3. Setelah membuatnya lalu compile lihat apakah ada eror atau tidak jika sudah berhasil maka balik ke home
4. Di Class Main kita klick kanan lalu pilih void menu () lalu enter 
5. Setalh itu muncul hasil output yang telah kita buat dari kode yang kita buat 
6. Pilih cara bermain dari setiap menu tersebut 
7. Selesai.


