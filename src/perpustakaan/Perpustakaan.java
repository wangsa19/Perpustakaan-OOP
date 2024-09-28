/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Perpustakaan {

    private static Perpustakaan single_instance = null;
//    private Anggota dataAnggota[];
//    private Buku dataBuku[];
//    private Peminjaman dataPeminjaman[];

    private ArrayList<Buku> dataBuku = new ArrayList<>();
    private ArrayList<Anggota> dataAnggota = new ArrayList<>();
    private ArrayList<Peminjaman> dataPeminjaman = new ArrayList<>();

    public Perpustakaan() {
        this.dataBuku = loadBukuFromFile("buku.txt");
    }

    private ArrayList<Buku> loadBukuFromFile(String filePath) {
        ArrayList<Buku> bukuList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\,");
                if (parts.length == 5) {
                    String judul = parts[0].trim();
                    String pengarang = parts[1].trim();
                    String isbn = parts[2].trim();
                    int tahunTerbit = Integer.parseInt(parts[3]);
                    boolean tersedia = Boolean.parseBoolean(parts[4]);
                    bukuList.add(new Buku(judul, pengarang, isbn, tahunTerbit, tersedia));
                    System.out.println("Buku dimuat: " + judul);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bukuList;
    }

    public static synchronized Perpustakaan getInstance() {
        if (single_instance == null) {
            single_instance = new Perpustakaan();
        }
        return single_instance;
    }

    public ArrayList<Anggota> getDataAnggota() {
        return dataAnggota;
    }

    public ArrayList<Buku> getDataBuku() {
        return dataBuku;
    }

    // Menambah buku ke dalam data
    public void tambahBuku(Buku buku) {
        dataBuku.add(buku);
    }

    // Menambah anggota ke dalam data
    public void tambahAnggota(Anggota anggota) {
        dataAnggota.add(anggota);
    }

    // Menambah peminjaman ke dalam data
    public void tambahPeminjaman(Peminjaman peminjaman) {
        dataPeminjaman.add(peminjaman);
    }

    // Method untuk menghapus buku
    public void hapusBuku(Buku buku) {
        dataBuku.remove(buku);
    }

    // Method untuk menghapus anggota
    public void hapusAnggota(Anggota anggota) {
        dataAnggota.remove(anggota);
    }

    // Method untuk menghapus peminjaman
    public void hapusPeminjaman(Peminjaman peminjaman) {
        dataPeminjaman.remove(peminjaman);
    }

    // Mencari buku berdasarkan judul
    public Buku cariBuku(String judul) {
        for (Buku buku : dataBuku) {
            System.out.println("Membandingkan: " + buku.getJudul() + " dengan " + judul);
            if (buku.getJudul().trim().equalsIgnoreCase(judul.trim())) {
                return buku; // Buku ditemukan
            }
        }
        return null; // Jika tidak ditemukan
    }
//    public Buku cariBuku(String judul) {
//        for (Buku buku : dataBuku) {
//            if (buku.getJudul().equalsIgnoreCase(judul)) {
//                return buku;
//            }
//        }
//        return null; // Jika buku tidak ditemukan
//    }

    // Mencari anggota berdasarkan nama
    public Anggota cariAnggota(String nama) {
        for (Anggota anggota : dataAnggota) {
            if (anggota.getUsername().equalsIgnoreCase(nama)) {
                return anggota;
            }
        }
        return null; // Jika anggota tidak ditemukan
    }

    // Mencari peminjaman berdasarkan buku yang dipinjam
    public Peminjaman cariPeminjaman(Buku buku) {
        for (Peminjaman peminjaman : dataPeminjaman) {
            if (peminjaman.getBuku().equals(buku)) {
                return peminjaman;
            }
        }
        return null; // Jika peminjaman tidak ditemukan
    }

    // Method untuk menampilkan semua buku
    public void tampilkanSemuaBuku() {
        if (dataBuku.isEmpty()) {
            System.out.println("Tidak ada buku yang tersedia.");
        } else {
            System.out.println("data Buku:");
            for (Buku buku : dataBuku) {
                System.out.println("Judul: " + buku.getJudul() + ", Pengarang: " + buku.getPengarang()
                        + ", ISBN: " + buku.getIsbn() + ", Tahun Terbit: " + buku.getTahunTerbit()
                        + ", Tersedia: " + (buku.isTersedia() ? "Ya" : "Tidak"));
            }
        }
    }

    // Method untuk menyimpan data buku ke file
    public void simpanBukuKeFile() {
        try {
            for (Buku buku : dataBuku) {
                String data = buku.getJudul() + "," + buku.getPengarang() + "," + buku.getIsbn() + ","
                        + buku.getTahunTerbit() + "," + buku.isTersedia();
                FileHandler.simpanKeFile("buku.txt", data);
            }
            System.out.println("Data buku berhasil disimpan ke buku.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method untuk menyimpan data anggota ke file
    public void simpanAnggotaKeFile() {
        try {
            for (Anggota anggota : dataAnggota) {
                String data = anggota.getUsername() + "," + anggota.getPassword();
                FileHandler.simpanKeFile("anggota.txt", data);
            }
            System.out.println("Data anggota berhasil disimpan ke anggota.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method untuk menyimpan data peminjaman ke file
    public void simpanPeminjamanKeFile() {
        try {
            for (Peminjaman peminjaman : dataPeminjaman) {
                String data = peminjaman.getBuku().getJudul() + "," + peminjaman.getAnggota().getUsername() + ","
                        + peminjaman.getTanggalPinjam() + "," + peminjaman.getTanggalKembali();
                FileHandler.simpanKeFile("peminjaman.txt", data);
            }
            System.out.println("Data peminjaman berhasil disimpan ke peminjaman.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
