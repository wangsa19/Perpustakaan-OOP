
import java.util.ArrayList;
import perpustakaan.Anggota;
import perpustakaan.Buku;
import perpustakaan.Peminjaman;
import perpustakaan.Perpustakaan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] args) {
// Membuat objek perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();
        String bukuDipilih = "Java Basics"; // Contoh judul yang dicari
        System.out.println("Mencari buku dengan judul: " + bukuDipilih);
        Buku buku = perpustakaan.cariBuku(bukuDipilih);
        System.out.println(buku);

        // Menambah beberapa buku
//        ArrayList<Buku> daftarBuku = new ArrayList<>();
//        daftarBuku.add(new Buku("Java Basics", "John Doe", "123456", 2020, true));
//        daftarBuku.add(new Buku("Data Structures", "Jane Smith", "654321", 2019, true));
//        daftarBuku.add(new Buku("Introduction to Algorithms", "Thomas H. Cormen", "987654", 2018, true));
//        daftarBuku.add(new Buku("Effective Java", "Joshua Bloch", "111213", 2021, true));
//        daftarBuku.add(new Buku("Design Patterns", "Erich Gamma", "141516", 2017, true));
//        daftarBuku.add(new Buku("Clean Code", "Robert C. Martin", "171819", 2020, true));
//        daftarBuku.add(new Buku("The Pragmatic Programmer", "Andrew Hunt", "202122", 2019, true));
//        daftarBuku.add(new Buku("Head First Java", "Kathy Sierra", "232425", 2020, true));
//        daftarBuku.add(new Buku("Java Concurrency in Practice", "Brian Goetz", "262728", 2019, true));
//        daftarBuku.add(new Buku("Spring in Action", "Craig Walls", "293031", 2021, true));
//        daftarBuku.add(new Buku("Java: The Complete Reference", "Herbert Schildt", "323334", 2020, true));
//        daftarBuku.add(new Buku("Learning Java", "Building Java Programs", "353637", 2018, true));
//        daftarBuku.add(new Buku("Java Cookbook", "Ian Darwin", "383940", 2020, true));
//        daftarBuku.add(new Buku("Java Performance", "Scott Oaks", "414243", 2021, true));
//        daftarBuku.add(new Buku("Programming in Java", "Carlo C. B. Dello", "444546", 2019, true));
//        daftarBuku.add(new Buku("Core Java Volume I", "Cay S. Horstmann", "474849", 2020, true));
//        daftarBuku.add(new Buku("Java All-in-One For Dummies", "Doug Lowe", "505152", 2021, true));
//        daftarBuku.add(new Buku("Java 8 in Action", "Raoul-Gabriel Urma", "535455", 2019, true));
//        daftarBuku.add(new Buku("Beginning Java 8 Fundamentals", "Kishori Sharan", "565758", 2020, true));
//        daftarBuku.add(new Buku("Java Programming and Problem Solving", "Lana L. S. Meyer", "596061", 2021, true));
//
//        // Menambah buku ke perpustakaan
//        for (Buku buku : daftarBuku) {
//            perpustakaan.tambahBuku(buku);
//        }
//
//        perpustakaan.simpanBukuKeFile();
//        perpustakaan.tampilkanSemuaBuku();
        // Menambah anggota
//        Anggota anggota1 = new Anggota("Alice", "alice");
//        Anggota anggota2 = new Anggota("Bob", "bob");
//        perpustakaan.tambahAnggota(anggota1);
//        perpustakaan.tambahAnggota(anggota2);
        // Menyimpan data buku ke file
        // Menyimpan data anggota ke file
//        perpustakaan.simpanAnggotaKeFile();
        // Melakukan peminjaman
//        Peminjaman peminjaman1 = new Peminjaman(buku1, anggota1, "2024-09-26", null);
//        perpustakaan.tambahPeminjaman(peminjaman1);
        // Menampilkan buku yang dipinjam
//        System.out.println("Buku yang dipinjam:");
//        Peminjaman peminjamanDitemukan = perpustakaan.cariPeminjaman(buku1);
//        if (peminjamanDitemukan != null) {
//            System.out.println("Judul: " + peminjamanDitemukan.getBuku().getJudul());
//            System.out.println("Dipinjam oleh: " + peminjamanDitemukan.getAnggota().getUsername());
//        } else {
//            System.out.println("Buku tidak sedang dipinjam.");
//        }
        // Mencari anggota
//        Anggota anggotaDitemukan = perpustakaan.cariAnggota("Alice");
//        if (anggotaDitemukan != null) {
//            System.out.println("Anggota ditemukan: " + anggotaDitemukan.getUsername());
//        } else {
//            System.out.println("Anggota tidak ditemukan.");
//        }
        // Menampilkan status ketersediaan buku
//        if (buku1.isTersedia()) {
//            System.out.println("Buku " + buku1.getJudul() + " tersedia.");
//        } else {
//            System.out.println("Buku " + buku1.getJudul() + " sudah dipinjam.");
//        }
        // menampilkan semua buku
//        System.out.println(buku1.toString());
//        System.out.println(buku2.toString());
    }
}
