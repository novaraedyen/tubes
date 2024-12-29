/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen_data_guru;

/**
 *
 * @author lenov
 */
public class Guru {
    private String nama;
    private String tanggalLahir;
    private String jenisKelamin;
    private String mataPelajaran;
    private String statusGuru;
    private String idGuru;

    // Constructor
    public Guru(String nama, String tanggalLahir, String jenisKelamin, String mataPelajaran, String statusGuru, String idGuru) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.mataPelajaran= mataPelajaran;
        this.statusGuru   = statusGuru;
        this.idGuru = idGuru;
    }


    // Getter 
    public String getNama() {
        return nama;
    }
    public String getTanggalLahir() {
        return tanggalLahir; 
    }
    public String getJenisKelamin() {
        return jenisKelamin; 
    }
    public String getStatusGuru() {
        return statusGuru;
    }
    public String getMataPelajaran() {
        return mataPelajaran;
    }
    public String getIdGuru() {
        return idGuru; 
    }
    
    //Setter
    public void setNamaString (String nama) {
        this.nama = nama; 
    }
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir; 
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin; 
    }
    public void setStatusGuru(String statusGuru) {
        this.statusGuru = statusGuru;
    }
    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }
    public void setIdGuru(String idGuru) {
        this.idGuru = idGuru; 
    }
    
}
