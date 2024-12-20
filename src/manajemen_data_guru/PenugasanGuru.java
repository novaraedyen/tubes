/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen_data_guru;

/**
 *
 * @author lenov
 */
public class PenugasanGuru {
    private int idPenugasan;
    private String tanggalMulai;
    private String tanggalSelesai;
    private int idGuru;
    private int idMataPelajaran;



    // Constructor dan Getter/Setter

    public int getIdPenugasan() {
        return idPenugasan;
    }

    public String getTanggalMulai() {
        return tanggalMulai;
    }

    public String getTanggalSelesai() {
        return tanggalSelesai;
    }

    public int getIdGuru() {
        return idGuru;
    }

    public int getIdMataPelajaran() {
        return idMataPelajaran;
    }
    
        public void setIdPenugasan(int idPenugasan) {
        this.idPenugasan = idPenugasan;
    }

    public void setTanggalMulai(String tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public void setTanggalSelesai(String tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }

    public void setIdGuru(int idGuru) {
        this.idGuru = idGuru;
    }

    public void setIdMataPelajaran(int idMataPelajaran) {
        this.idMataPelajaran = idMataPelajaran;
    }
}