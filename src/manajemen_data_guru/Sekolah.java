/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen_data_guru;

/**
 *
 * @author lenov
 */
public class Sekolah {
    private int idSekolah;
    private String namaSekolah;
    private String alamat;
    private String nomorKontak;
    
public Sekolah(int idSekolah, String namaSekolah, String alamat, String nomorKontak) {
        this.idSekolah = idSekolah;
        this.namaSekolah = namaSekolah;
        this.alamat = alamat;
        this.nomorKontak = nomorKontak;
    }


    public void setIdSekolah(int idSekolah) {
        this.idSekolah = idSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNamaKontak(String namaKontak) {
        this.nomorKontak = namaKontak;
    }

    public int getIdSekolah() {
        return idSekolah;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNamaKontak() {
        return nomorKontak;
    }
    
}
