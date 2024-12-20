/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen_data_guru;

/**
 *
 * @author lenov
 */
public class Kualifikasi {
    private int idKualifikasi;
    private String namaGelar;
    private String institusi;
    private int tahunDiperoleh;
    private int idGuru;

    public Kualifikasi(int idKualifikasi, String namaGelar, String institusi, int tahunDiperoleh, int idGuru) {
        this.idKualifikasi = idKualifikasi;
        this.namaGelar = namaGelar;
        this.institusi = institusi;
        this.tahunDiperoleh = tahunDiperoleh;
        this.idGuru = idGuru;
    }
    
    public void setIdKualifikasi(int idKualifikasi) {
        this.idKualifikasi = idKualifikasi;
    }

    public void setNamaGelar(String namaGelar) {
        this.namaGelar = namaGelar;
    }

    public void setInstitusi(String institusi) {
        this.institusi = institusi;
    }

    public void setTahunDiperoleh(int tahunDiperoleh) {
        this.tahunDiperoleh = tahunDiperoleh;
    }

    public void setIdGuru(int idGuru) {
        this.idGuru = idGuru;
    }

    public int getIdKualifikasi() {
        return idKualifikasi;
    }

    public String getNamaGelar() {
        return namaGelar;
    }

    public String getInstitusi() {
        return institusi;
    }

    public int getTahunDiperoleh() {
        return tahunDiperoleh;
    }

    public int getIdGuru() {
        return idGuru;
    }

}