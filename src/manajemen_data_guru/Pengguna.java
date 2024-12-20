/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen_data_guru;

/**
 *
 * @author lenov
 */
public class Pengguna {
    private int idPengguna;
    private String namaPengguna;
    private String kataSandi;
    private String peran;
    private int idGuru;


    // Constructor dan Getter/Setter

    public int getIdPengguna() {
        return idPengguna;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public String getKataSandi() {
        return kataSandi;
    }

    public String getPeran() {
        return peran;
    }

    public int getIdGuru() {
        return idGuru;
    }
    
    public void setIdPengguna(int idPengguna) {
        this.idPengguna = idPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }

    public void setIdGuru(int idGuru) {
        this.idGuru = idGuru;
    }
}