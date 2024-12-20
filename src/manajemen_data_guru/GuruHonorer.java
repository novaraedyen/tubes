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
    public GuruHonorer(int idGuru, String namaDepan, String namaBelakang, String tanggalLahir, String jenisKelamin, 
                       double tarifPerJam, int jamMengajarPerMinggu) {
        super(idGuru, namaDepan, namaBelakang, tanggalLahir, jenisKelamin); // memanggil constructor superclass
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