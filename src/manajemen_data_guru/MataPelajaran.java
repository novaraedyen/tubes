/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen_data_guru;

/**
 *
 * @author lenov
 */
public class MataPelajaran {
    private int idMataPelajaran;
    private String namaMataPelajaran;
    private String deskripsi;
    private String tingkatKelas;


    // Constructor dan Getter/Setter

    public int getIdMataPelajaran() {
        return idMataPelajaran;
    }

    public String getNamaMataPelajaran() {
        return namaMataPelajaran;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getTingkatKelas() {
        return tingkatKelas;
    }
    
    public void setIdMataPelajaran(int idMataPelajaran) {
        this.idMataPelajaran = idMataPelajaran;
    }

    public void setNamaMataPelajaran(String namaMataPelajaran) {
        this.namaMataPelajaran = namaMataPelajaran;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setTingkatKelas(String tingkatKelas) {
        this.tingkatKelas = tingkatKelas;
    }
}