/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author ACER
 */
public class Peminjaman {

    private Buku buku;
    private Anggota anggota;
    private String tanggalPinjam;
    private String tanggalKembali;

    public Peminjaman(Buku buku, Anggota anggota, String tanggalPinjam, String tanggalKembali) {
        this.buku = buku;
        this.anggota = anggota;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    @Override
    public String toString() {
        return "Peminjaman{" + "buku=" + buku + ", anggota=" + anggota + ", tanggalPinjam=" + tanggalPinjam + ", tanggalKembali=" + tanggalKembali + '}';
    }
    
    
}
