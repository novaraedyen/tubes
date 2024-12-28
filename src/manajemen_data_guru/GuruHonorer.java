/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen_data_guru;

/**
 *
 * @author lenov
 */
public class GuruHonorer extends Guru {
    private double tarifPerJam;
    private int jamMengajarPerMinggu;

    // Constructor
    public GuruHonorer(String nama, String tanggalLahir, String jenisKelamin, String mataPelajaran, String statusGuru, int idGuru, 
                       double tarifPerJam, int jamMengajarPerMinggu) {
        super(nama, tanggalLahir, jenisKelamin, statusGuru, mataPelajaran, idGuru); // memanggil constructor superclass
        this.tarifPerJam = tarifPerJam;
        this.jamMengajarPerMinggu = jamMengajarPerMinggu;
    }

    // Getter dan Setter
    public double getTarifPerJam() { return tarifPerJam; }
    public void setTarifPerJam(double tarifPerJam) { this.tarifPerJam = tarifPerJam; }

    public int getJamMengajarPerMinggu() { return jamMengajarPerMinggu; }
    public void setJamMengajarPerMinggu(int jamMengajarPerMinggu) { this.jamMengajarPerMinggu = jamMengajarPerMinggu; }

    // Metode khusus
    public double hitungGaji() {
        return tarifPerJam * jamMengajarPerMinggu;
    }
}