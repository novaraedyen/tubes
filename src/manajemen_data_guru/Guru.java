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
    private int idGuru;
    private String namaDepan;
    private String namaBelakang;
    private String tanggalLahir;
    private String jenisKelamin;

    // Constructor
    public Guru(int idGuru, String namaDepan, String namaBelakang, String tanggalLahir, String jenisKelamin) {
        this.idGuru = idGuru;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
    }

    // Getter 
    public int getIdGuru() {
        return idGuru; 
    }
    public String getNamaDepan() {
        return namaDepan; 
    }
    public String getNamaBelakang() {
        return namaBelakang; 
    }
    public String getTanggalLahir() {
        return tanggalLahir; 
    }
    public String getJenisKelamin() {
        return jenisKelamin; 
    }
    
    //Setter
    public void setIdGuru(int idGuru) {
        this.idGuru = idGuru; 
    }
    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan; 
    }
    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang; 
    }
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir; 
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin; 
    }
    
}
